package exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

// BEGIN

// END
@Value
@Getter
@AllArgsConstructor
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
