package HW_Java.Seminar_6_HW;

import Seminar_Java.Seminar_6.task_3.Cat;

public class Laptop {
    private Integer ram;
    private Integer hardDriveCapacity;
    private String operationSystem;
    private String color;
    private Integer screenSize;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(Integer hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Producer: " + name + ", Color: " + color + ", Sreen size: " + screenSize + ", RAM: " + ram + ", Hard Drive Capacity: " + hardDriveCapacity + ", Operation system: " + operationSystem;
    }
}
