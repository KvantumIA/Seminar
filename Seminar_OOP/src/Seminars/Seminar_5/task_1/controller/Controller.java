package Seminars.Seminar_5.task_1.controller;

import Seminars.Seminar_5.task_1.model.*;
import Seminars.Seminar_5.task_1.service.DataService;
import Seminars.Seminar_5.task_1.view.StudentView;
import Seminars.Seminar_5.task_1.service.StudyGroupService;
import Seminars.Seminar_5.task_1.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsoleStudent((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user : userList) {
            studentView.printOnConsoleTeacher((Teacher) user);
        }
    }

    public List<Student> getListOfStudents() {
        List<User> userList = dataService.getAllStudent();
        List<Student> students = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

        public List<Teacher> getListOfTeacher(){
        List<User> userList = dataService.getAllTeacher();
        List<Teacher> teacher = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Teacher){
                teacher.add((Teacher) user);
            }
        }
        return teacher;
    }
    public void createStudyGroup(Teacher teacher, List<Student> students) {
        studyGroupService.create(teacher, students);
    }

    public void getAllStudyGroup() {
        studentView.printOnConsoleStudyGroup(studyGroupService.getStudyGroup());
    }
}
