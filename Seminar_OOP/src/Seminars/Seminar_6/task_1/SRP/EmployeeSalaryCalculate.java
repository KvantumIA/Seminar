package Seminars.Seminar_6.task_1.SRP;

public class EmployeeSalaryCalculate {
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double salaryCalculate(){
        return baseSalary * 0.4;
    }
}
