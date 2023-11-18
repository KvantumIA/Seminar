package Seminars.Seminar_1.task_1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> BottleOfWatter) {
        this.hotDrinks = BottleOfWatter;
    }

    public List<HotDrink> gethotDrinks() {
        return hotDrinks;
    }

    public void sethotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
    @Override
    public Product getProduct(String name) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }


    public Product getProduct(String name, double volume, int temperature) {
        for (HotDrink drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}
