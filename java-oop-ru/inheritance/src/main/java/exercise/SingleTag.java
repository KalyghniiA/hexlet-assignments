package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag{

    public SingleTag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes.putAll(attributes);
    }

    @Override
    public String toString() {
        return String.format("<%s%s>", getTag(), getAttributes());
    }


}
// END
