package HW.Seminar_6_HW.data;

import java.util.List;

public class StudentGroup implements Iterable<Student>{         //класс StudentGroup имплементирует интерфейс Iterable который позволяет выводить списки студентов и учителей, он соответствует принципу SRP, т.к. он отвечает только за создание студенческих групп
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
               "students=" + students +
               ", teacher=" + teacher +
               '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
