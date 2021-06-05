package entities.carriages;

import entities.users.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PassengerCarriageTest {

    @Test
    void addPassenger_successfully() {
        PassengerCarriage carriage = new PassengerCarriage(3);

        assertTrue(carriage.addPassenger(createAnyPassenger()));
    }

    @Test
    void addPassenger_unsuccessfully() {
        PassengerCarriage carriage = new PassengerCarriage(3);

        carriage.addPassenger(createAnyPassenger());

        assertFalse(carriage.addPassenger(createAnyPassenger()));
    }

    public Passenger createAnyPassenger() {
        return new Passenger("", "", 1, 1);
    }
}