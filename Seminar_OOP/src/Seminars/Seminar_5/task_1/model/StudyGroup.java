package Seminars.Seminar_5.task_1.model;

import java.util.List;

public class StudyGroup {
    private List<Student> studentList;
    private Teacher teacher;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.studentList = students;
        this.teacher = teacher;
    }

    public List<Student> getstudentList() {
        return studentList;
    }

    public void setstudentList(List<Student> students) {
        this.studentList = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "students= \n" + studentList +
                ", teacher= \n" + teacher +
                '}'+'\n';
    }
}