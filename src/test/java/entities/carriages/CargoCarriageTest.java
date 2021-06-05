package entities.carriages;

import entities.Cargo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CargoCarriageTest {

    @Test
    void addCargo_successfully() {
        CargoCarriage carriage = new CargoCarriage(100);

        assertTrue(carriage.addCargo(createAnyCargo()));
    }

    @Test
    void addCargo_unsuccessfully() {
        CargoCarriage carriage = new CargoCarriage(100);
        Cargo cargo = createAnyCargo();

        cargo.setWeight(1000);

        assertFalse(carriage.addCargo(cargo));
    }

    public Cargo createAnyCargo() {
        return new Cargo(10, "", "", "");
    }
}