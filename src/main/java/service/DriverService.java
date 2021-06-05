package service;

import entities.users.Driver;
import entities.users.User;
import exceptions.AgeException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DriverService {
    public static Driver createDriver(User user) {
        if (user.getAge() < 18) {
            try {
                log.info("age is small");
                throw new AgeException();
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
        log.info("create driver successfully");
        return new Driver(user.getFirstName(), user.getLastName(), user.getAge());
    }
}
