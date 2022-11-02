package exercise;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
@Value
@Getter
@AllArgsConstructor
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws IOException {
        return new ObjectMapper().writeValueAsString(this);
    }

    public static Car unserialize(String json) throws IOException {
        return new ObjectMapper().readValue(json, Car.class);
    }
    // END
}
