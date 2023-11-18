package Seminars.Seminar_5.task_1;

import Seminars.Seminar_3_1.Student;
import Seminars.Seminar_3_1.StudentGroup;
import Seminars.Seminar_5.task_1.controller.Controller;
import Seminars.Seminar_5.task_1.model.Teacher;

public class main {
    public static void main(String[] args) {
        Controller controller1 = new Controller();
        controller1.createStudent("Александров", "Александр", "Александрович");
        controller1.createStudent("Борисов", "Борис", "Борисович");
        controller1.createStudent("Внуков", "Внук", "Внукович");
//        controller1.getAllStudent();

        controller1.createTeacher("Учитель", "aaa","aaa");
//        controller1.getAllTeacher();

        Controller controller4 = new Controller();
        controller4.createStudyGroup(new Teacher("Учитель", "aaa","aaa", 1), controller1.getListOfStudents());

        controller4.getAllStudyGroup();
    }

}
