package Seminars.Seminar_6.task_1.LSP;

public class Rectangle extends QuadRangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        return height * width;
    }
}
