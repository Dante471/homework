package pro.sky.java.course1.coursework;

public class Main {

    public static void main(String[] args) {
        EmployeeBook skyPro = new EmployeeBook(10);
        Employee em1 = new Employee("Ekaterina Gavrilova", 1, 80000);
        Employee em2 = new Employee("Kirill Kachalov", 2, 250000);
        Employee em3 = new Employee("Artem Sus", 1, 100000);
        Employee em4 = new Employee("Ilya Sazonov", 2, 210000);
        Employee em5 = new Employee("Fedor Sazonov", 2, 180000);
        Employee em6 = new Employee("Anna Polunina", 3, 55000);
        Employee em7 = new Employee("Daniil Gorbunov", 4, 249999);
        Employee em8 = new Employee("Vitaly Komlev", 4, 150000);
        Employee em9 = new Employee("Tamerlan Radzhabov", 4, 160000);
        Employee em10 = new Employee("Sergey Anosov", 4, 354000);
        skyPro.addEmployee(em1);
        skyPro.addEmployee(em2);
        skyPro.addEmployee(em3);
        skyPro.addEmployee(em4);
        skyPro.addEmployee(em5);
        skyPro.addEmployee(em6);
        skyPro.addEmployee(em7);
        skyPro.addEmployee(em8);
        skyPro.addEmployee(em9);
        skyPro.addEmployee(em10);
        System.out.println(skyPro);
        separator();
        skyPro.printAllSortedByDepartment();
        separator();
        System.out.println("Department 2 summary salary: " + skyPro.getSumSalaryByDepartment(2));
        separator();
        System.out.println("Summary salary: " + skyPro.sumSalary());
        separator();
        skyPro.changeDepartmentByName("Daniil Gorbunov", 1);
        separator();
        System.out.println(skyPro.getMinSalaryEmployee());
        separator();
        System.out.println(skyPro.getMaxSalaryEmployee());
        separator();
        System.out.println("Average salary " + skyPro.getAverageSalary());
        separator();
        skyPro.printFullNames();
        separator();
        skyPro.indexingSalary(12);
        separator();
        skyPro.getMinSalaryByDepartment(1);
        separator();
        skyPro.getAverageSalaryByDepartment(2);
        separator();
        skyPro.indexingSalaryByDepartment(10, 3);
        separator();
        skyPro.printByDepartment(1);
        separator();
        skyPro.printByLessSalary(100000);
        separator();
        skyPro.printByMoreSalary(200000);
        separator();
        skyPro.removeEmployeeById(7);
    }

    private static void separator() {
        System.out.println("=================================");
    }
}
