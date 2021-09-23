package pro.sky.java.course1.coursework;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int counter;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee: " + fullName + ", department №: " + department + ", salary: " + salary + ", id:" + id;
    }
}
