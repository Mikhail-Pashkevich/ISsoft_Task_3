package entities.carriages;

import entities.users.Driver;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LocomotiveCarriage extends Carriage {
    private Driver driver;

    public LocomotiveCarriage(Driver driver) {
        super();
        this.driver = driver;
    }
}
