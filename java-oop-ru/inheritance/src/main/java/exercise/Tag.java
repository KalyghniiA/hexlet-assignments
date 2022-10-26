package exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    String tag;
    Map<String, String> attributes = new LinkedHashMap<>();

    public abstract String toString();

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public String getAttributes() {
        StringBuilder resultTag = new StringBuilder();
        this.attributes.entrySet().stream()
                .forEach(attribute -> {
                    resultTag.append(
                            String.format(
                                    " %s=\"%s\"",
                                    attribute.getKey(),
                                    attribute.getValue()));
                });

        return resultTag.toString();
    }
}
// END
