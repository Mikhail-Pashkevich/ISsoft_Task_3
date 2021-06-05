package service;

import entities.Train;
import entities.carriages.CargoCarriage;
import entities.carriages.Carriage;
import entities.carriages.LocomotiveCarriage;
import entities.carriages.PassengerCarriage;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class TrainBuilder {
    private final Train train = new Train();

    public void addCarriage(Carriage carriage) {
        if (carriage.getClass() == PassengerCarriage.class || carriage.getClass() == CargoCarriage.class) {
            log.info("add carriage");
            Carriage lastCarriage = train.getMainLocomotive();
            while (lastCarriage.getNext() != null) {
                lastCarriage = lastCarriage.getNext();
            }
            lastCarriage.setNext(carriage);
            return;
        }
        if (carriage.getClass() == LocomotiveCarriage.class) {
            log.info("add locomotive");
            train.setMainLocomotive((LocomotiveCarriage) carriage);
            return;
        }
        log.info("not implemented yet");
        throw new UnsupportedOperationException("you can add new realisation later");
    }
}
