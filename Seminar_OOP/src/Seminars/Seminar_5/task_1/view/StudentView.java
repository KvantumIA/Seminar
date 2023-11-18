package Seminars.Seminar_5.task_1.view;

import Seminars.Seminar_5.task_1.model.Student;
import Seminars.Seminar_5.task_1.model.StudyGroup;
import Seminars.Seminar_5.task_1.model.Teacher;

public class StudentView {
    public void printOnConsoleStudent(Student student){
        System.out.println(student);
    }
    public void printOnConsoleTeacher(Teacher teacher){
        System.out.println(teacher);
    }
    public void printOnConsoleStudyGroup(StudyGroup studyGroup){
        System.out.println(studyGroup.toString());
    }
}
