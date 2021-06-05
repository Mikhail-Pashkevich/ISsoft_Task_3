package entities.users;


import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class Driver extends User {
    private final String licenseId;

    public Driver(String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
        this.licenseId = UUID.randomUUID().toString();
    }
}
