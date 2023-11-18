package Seminars.Seminar_3_1;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
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

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students= \n" + studentList +
                ", teacher= \n" + teacher +
                '}'+'\n';
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}