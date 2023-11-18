package Seminars.Seminar_6.task_1.OCP;

public class Vehicle {
    private  int maxSpeed;
    private String type;
    public double calculateMaxSpeed(){
        return maxSpeed;
    }

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
