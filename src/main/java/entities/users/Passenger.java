package entities.users;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;


@Getter
@ToString
public class Passenger extends User {
    private final String ticketId;
    private final int seat;

    public Passenger(String firstName, String lastName, int age, int seat) {
        super(firstName, lastName, age);
        this.ticketId = UUID.randomUUID().toString();
        this.seat = seat;
    }
}
