package Seminars.Seminar_5.task_1.model;

public class Teacher extends User{
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + '\'' +
                ", FirstName='" + getFirstName() + '\'' +
                ", SecondName='" + getSecondName() + '\'' +
                ", LastName='" + getLastName() + '\'' +
                '}';
    }
}
