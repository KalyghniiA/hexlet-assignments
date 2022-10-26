package exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    String tagBody;
    List<Tag> singleTags = new LinkedList<>();

    public PairedTag(String tag, Map<String, String> attributes, String tagBody, List<Tag> singleTags) {
        this.tag = tag;
        this.attributes.putAll(attributes);
        this.tagBody = tagBody;
        this.singleTags.addAll(singleTags);
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(String.format("<%s%s>", getTag(), getAttributes()))
                .append(getSingleTags())
                .append(getTagBody())
                .append(String.format("</%s>", getTag()))
                .toString();
    }

    private String getSingleTags() {
        StringBuilder result = new StringBuilder();
        singleTags.stream()
                .forEach(elem -> {
                    result.append(elem.toString());
                });
        return result.toString();
    }

    private String getTagBody() {
        return this.tagBody;
    }
}
// END
