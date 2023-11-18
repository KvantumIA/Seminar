package HW.Seminar_6_HW.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{                  //класс Teacher наследуется от класса User, этот класс соответсвует принципу SRP, OCP, ISP, т.к. он нужен только для создания учителей

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
