package service;

import entities.users.User;
import exceptions.AgeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DriverServiceTest {

    @Test
    void createDriver_successfully() {
        assertNotEquals(null, DriverService.createDriver(createAnyUser()));
    }

    @Test
    void createDriver_unsuccessfully() {
        User user = createAnyUser();

        user.setAge(10);

        assertThrows(AgeException.class, () -> DriverService.createDriver(createAnyUser()));
    }

    public User createAnyUser() {
        return new User("", "", 18);
    }
}