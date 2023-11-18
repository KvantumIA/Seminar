package HW.Seminar_6_HW.service;

import HW.Seminar_6_HW.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {        //класс StudentService имплементирует интерфейс UserService, он соответствует принципу SRP, ISP, т.к. он отвечает только за создание списка студентов и присвоения им ID

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }          //переопределение метода

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {      //переопределение метода создания студентов
        Long countMaxId = 0L;
        for (Student student: students){
                if (student.getStudentId() > countMaxId){
                    countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
}
