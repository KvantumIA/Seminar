package Seminars.Seminar_1.task_1;

public class HotDrink extends BottleOfWatter{

    public HotDrink(String name, double cost, double volume, int Temperature) {
        super(name, cost, volume);
        this.temperature = Temperature;
    }
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() +
                ", temperature=" + temperature +
                ", cost = " + super.getCost() +
                '}';
    }
}
