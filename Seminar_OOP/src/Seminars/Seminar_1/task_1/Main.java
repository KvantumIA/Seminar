package Seminars.Seminar_1.task_1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
//        System.out.println(vendingMachine.getProduct("20", 5));
//        System.out.println(vendingMachine.getProduct("20", 100));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }

        HotDrink hd1 = new HotDrink("hot1", 1, 1, 45);
        HotDrink hd2 = new HotDrink("hot2", 1, 2, 44);
        HotDrink hd3 = new HotDrink("hot3", 1, 3,44);
        HotDrink hd4 = new HotDrink("hot4", 1, 4,32);
        HotDrink hd5 = new HotDrink("hot5", 1, 5,56);

        HotDrinkVendingMachine vendingMachine1 = new HotDrinkVendingMachine(new ArrayList<>());
        vendingMachine1.addHotDrink(hd1);
        vendingMachine1.addHotDrink(hd2);
        vendingMachine1.addHotDrink(hd3);
        vendingMachine1.addHotDrink(hd4);
        vendingMachine1.addHotDrink(hd5);

        for (HotDrink hotDrink: vendingMachine1.gethotDrinks()) {
            System.out.println(hotDrink);
        }
//        System.out.println(vendingMachine1.getProduct("hot3",3, 44));
    }

}