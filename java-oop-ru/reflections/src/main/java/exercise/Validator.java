package exercise;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

// BEGIN
public class Validator {

    public static List<String> validate(Address element) {
        List<String> notValidationFields = new LinkedList<>();
        Field[] fields = element.getClass().getDeclaredFields();

        for (Field field: fields) {
            field.setAccessible(true);
            NotNull notNull = field.getAnnotation(NotNull.class);
            try {
                if (notNull != null && field.get(element) == null) {

                    notValidationFields.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        return notValidationFields;
    }

}
// END
