package entities.carriages;


import entities.Cargo;
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
public class CargoCarriage extends Carriage {
    private final double maxWeight;
    private final List<Cargo> cargoes;

    public CargoCarriage(double maxWeight) {
        super();
        this.maxWeight = maxWeight;
        this.cargoes = new ArrayList<>();
    }

    public boolean addCargo(Cargo cargo) {
        log.info("start add cargo");
        double currentWeight = 0;

        for (Cargo value : cargoes) {
            currentWeight += value.getWeight();
        }

        if (currentWeight + cargo.getWeight() < maxWeight) {
            log.info("add cargo successfully");
            cargoes.add(cargo);
            return true;
        }
        log.info("add cargo unsuccessfully");
        return false;
    }
}
