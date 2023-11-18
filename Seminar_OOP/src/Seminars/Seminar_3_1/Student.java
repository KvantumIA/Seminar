package Seminars.Seminar_3_1;


public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "studentId='" + studentId +'\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (o.getStudentId() > studentId)
            return -1;
        if (o.getStudentId() < studentId)
            return 1;
        return 0;
    }
}
