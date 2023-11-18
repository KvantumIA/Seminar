package Seminars.Seminar_5.task_1.model;

public abstract class User {
    private String FirstName;
    private String SecondName;
    private String LastName;

    public User(String firstName, String secondName, String lastName) {
        FirstName = firstName;
        SecondName = secondName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
