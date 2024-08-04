package School.Management.System;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int SalaryEarned;



    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void recieveSalary(int salary){
        SalaryEarned+=salary;
        School.updateTotalMoneySpent(SalaryEarned);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", SalaryEarned=" + SalaryEarned +
                '}';
    }
}
