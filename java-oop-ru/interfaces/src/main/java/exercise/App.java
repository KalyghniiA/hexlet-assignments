package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildAppartmentsList(List<Home> apartments, int countElements) {
        List<Home> copyArray = new ArrayList<>(List.copyOf(apartments));
        List<String> result = new ArrayList<>();
        if (copyArray.size() == 0) {
            return result;
        }
        copyArray.sort((el1,el2) -> el1.compareTo(el2));

        for (var i = 0; i < countElements; i++) {
            result.add(copyArray.get(i).toString());
        }

        return result;
    }
}
// END
