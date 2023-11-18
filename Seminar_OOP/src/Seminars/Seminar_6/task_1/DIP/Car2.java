package Seminars.Seminar_6.task_1.DIP;

public class Car2 {
    private Engine engine;
    public Car2(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
