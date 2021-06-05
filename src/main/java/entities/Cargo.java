package entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Cargo {

    private final String id;
    private  double weight;
    private final String departureAddress;
    private final String arrivalAddress;
    private final String owner;

    public Cargo(double weight, String departureAddress, String arrivalAddress, String owner) {
        id = UUID.randomUUID().toString();
        this.weight = weight;
        this.departureAddress = departureAddress;
        this.arrivalAddress = arrivalAddress;
        this.owner = owner;
    }
}
