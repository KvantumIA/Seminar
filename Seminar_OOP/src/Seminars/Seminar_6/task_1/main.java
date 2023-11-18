package Seminars.Seminar_6.task_1;

import Seminars.Seminar_6.task_1.DIP.Car2;
import Seminars.Seminar_6.task_1.DIP.DieselEngine;
import Seminars.Seminar_6.task_1.DIP.PetrolEngine;
import Seminars.Seminar_6.task_1.OCP.Bus;
import Seminars.Seminar_6.task_1.OCP.Car;
import Seminars.Seminar_6.task_1.OCP.Vehicle;

public class main {
    public static void main(String[] args) {
//        testOCP(new Vehicle(100, "Vehicle"));
//        testOCP(new Car(100));
//        testOCP(new Bus(100));
        testDIP();
    }
    static void testOCP(Vehicle vehicle){
        System.out.println(vehicle.calculateMaxSpeed() + " " + vehicle.getType());
    }
    static void testDIP(){
        Car2 car = new Car2(new DieselEngine());
        car.start();
        Car2 car2 = new Car2(new PetrolEngine());
        car2.start();
    }
}
