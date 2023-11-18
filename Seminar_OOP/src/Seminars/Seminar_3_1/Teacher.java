package Seminars.Seminar_3_1;

public class Teacher extends User{
    private int teacherId;
    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }
    public int getTeacherId(){
        return teacherId;
    }
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                "teacherId='" + teacherId +'\'' +
                '}';
    }
}
