package entities;

import entities.carriages.Carriage;
import entities.carriages.LocomotiveCarriage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Train {
    private String trainNumber;
    private Date departureTime;
    private Date arrivalTime;
    private String departureAddress;
    private String arrivalAddress;
    private LocomotiveCarriage mainLocomotive;

    public Train() {
    }

    public Train(Date departureTime,
                 Date arrivalTime,
                 String departureAddress,
                 String arrivalAddress,
                 LocomotiveCarriage mainLocomotive) {
        this.trainNumber = UUID.randomUUID().toString();
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAddress = departureAddress;
        this.arrivalAddress = arrivalAddress;
        this.mainLocomotive = mainLocomotive;
    }
}
