package Seminars.Seminar_6.task_1.ISP;

public class Cube implements Shape3D{
    private int len;

    public Cube() {
    }

    @Override
    public double perimetr() {
        return len * 12;
    }

    @Override
    public double volume() {
        return len * len * len;
    }

}
