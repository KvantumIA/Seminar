package Seminars.Seminar_4.task_1;

import Seminars.Seminar_4.task_1.controller.TeacherController;
import Seminars.Seminar_4.task_1.view.TeacherView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TeacherController tc = new TeacherController();
        TeacherView tv = new TeacherView();
        tc.create("Иван", "Иванов", "Иванович", LocalDate.of(2000, 1, 1));
        tc.create("Петр", "Петров", "Петрович", LocalDate.of(2001, 2, 2));
        tc.create("Сидор", "Сидоров", "Сидорович", LocalDate.of(2002, 3, 3));

        tc.updateTeacher(1, "Сергей", "Иванов", "Иванович", LocalDate.of(2000, 1, 1));
        tv.sendOnConsole(tc.getAll());
    }
}
