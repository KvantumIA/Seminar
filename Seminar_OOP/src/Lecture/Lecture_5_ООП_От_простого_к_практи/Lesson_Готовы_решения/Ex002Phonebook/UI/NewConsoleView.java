package Lecture.Lecture_5_ООП_От_простого_к_практи.Lesson_Готовы_решения.Ex002Phonebook.UI;

public class NewConsoleView extends ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
