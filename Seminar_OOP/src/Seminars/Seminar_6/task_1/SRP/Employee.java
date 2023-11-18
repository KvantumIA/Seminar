package Seminars.Seminar_6.task_1.SRP;

public class Employee {
    private String name;
    private String dol;

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }
}
