import entities.Cargo;
import entities.Train;
import entities.carriages.CargoCarriage;
import entities.carriages.Carriage;
import entities.carriages.LocomotiveCarriage;
import entities.carriages.PassengerCarriage;
import entities.users.Passenger;
import entities.users.User;
import service.DriverService;
import service.TrainBuilder;


public class Runner {
    public static void main(String[] args) {
        LocomotiveCarriage locomotiveCarriage = new LocomotiveCarriage(DriverService.createDriver(new User("first name", "last name", 20)));
        PassengerCarriage passengerCarriage = new PassengerCarriage(50);
        CargoCarriage cargoCarriage = new CargoCarriage(100_000);

        passengerCarriage.addPassenger(new Passenger("name1", "surname1", 10, 1));
        passengerCarriage.addPassenger(new Passenger("name2", "surname2", 15, 2));
        passengerCarriage.addPassenger(new Passenger("name3", "surname3", 20, 3));

        cargoCarriage.addCargo(new Cargo(100, "departure", "arrival", "owner"));

        TrainBuilder trainBuilder = new TrainBuilder();

        trainBuilder.addCarriage(locomotiveCarriage);
        trainBuilder.addCarriage(passengerCarriage);
        trainBuilder.addCarriage(cargoCarriage);


        System.out.println(trainBuilder.getTrain().toString());

        PassengerCarriage next1 =(PassengerCarriage) trainBuilder.getTrain().getMainLocomotive().getNext();
        System.out.println(next1.toString());

        CargoCarriage next2=(CargoCarriage) trainBuilder.getTrain().getMainLocomotive().getNext().getNext();
        System.out.println(next2.toString());
    }
}
