package Lecture.Lecture_5_ООП_От_простого_к_практи.Lesson_Готовы_решения.Ex001Calc;

public class PresenterOfT<T extends CalcModel> {
 

    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
