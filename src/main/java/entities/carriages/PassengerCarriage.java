package entities.carriages;


import entities.users.Passenger;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
@Setter
@ToString
public class PassengerCarriage extends Carriage {
    private int seats;
    private List<Passenger> passengers;

    public PassengerCarriage(int seats) {
        super();
        this.seats = seats;
        this.passengers = new ArrayList<>(seats);
        for (int i = 0; i < seats; i++) {
            passengers.add(null);
        }
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.get(passenger.getSeat()) == null) {
            passengers.set(passenger.getSeat(), passenger);
            log.info("add passenger successfully");
            return true;
        }
        log.info("add passenger unsuccessfully");
        return false;
    }
}
