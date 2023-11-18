package Lecture.Lecture_5_ООП_От_простого_к_практи.task_1;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();

    }
}
