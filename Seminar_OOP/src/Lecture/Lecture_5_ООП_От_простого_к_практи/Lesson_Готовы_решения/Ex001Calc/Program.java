package Lecture.Lecture_5_ООП_От_простого_к_практи.Lesson_Готовы_решения.Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
