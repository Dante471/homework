package pro.sky.java.course1.coursework;


public class EmployeeBook {
    private static Employee[] employees;
    private static int size;

    public EmployeeBook(int length) {
        employees = new Employee[length];
    }

    private static int findFreeIndex() {
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] == null) {
                return index;
            }
        }
        System.out.println("Employees book is full");
        return -1;
    }

    public void addEmployee(Employee employee) {
        int index = findFreeIndex();
        if (index >= 0 && index < employees.length) {
            employees[index] = employee;
            size++;
        } else {
            return;
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public Employee getMinSalaryEmployee() {
        int minSalary = employees[0].getSalary();
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public Employee getMaxSalaryEmployee() {
        int maxSalary = employees[0].getSalary();
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public double getAverageSalary() {
        double averageSalary = this.sumSalary() / size;
        return averageSalary;
    }

    public void printFullNames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public void indexingSalary(int percent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() / 100 * percent));
        }
        System.out.println("Indexing complete!");
    }

    public Employee getMinSalaryByDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment()) {
                int minSalary = employees[i].getSalary();
                Employee minSalaryEmployee = employees[i];
                if (minSalary > employees[i].getSalary()) {
                    minSalaryEmployee = employees[i];
                }
                return minSalaryEmployee;
            }
        }
        System.out.println("Department not found");
        return null;
    }

    public Employee getMaxSalaryByDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment()) {
                int maxSalary = employees[i].getSalary();
                Employee maxSalaryEmployee = employees[i];
                if (maxSalary < employees[i].getSalary()) {
                    maxSalaryEmployee = employees[i];
                }
                return maxSalaryEmployee;
            }
        }
        System.out.println("Department not found");
        return null;
    }

    public int getSumSalaryByDepartment(int department) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment()) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public double getAverageSalaryByDepartment(int department) {
        double averageSalary = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment()) {
                count++;
            }
        }
        averageSalary = this.getSumSalaryByDepartment(department) / count;
        return averageSalary;
    }

    public void indexingSalaryByDepartment(int percent, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() / 100 * percent));
            }
        }
        System.out.println("Indexing complete!");
    }

    public void printByDepartment(int department) {
        System.out.println("Department number " + department);
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                System.out.printf("Employee %s: ID: %d, Salary: %d\n", employees[i].getFullName(), employees[i].getId(), employees[i].getSalary());
            }
        }
    }

    public void printByLessSalary(int salaryLessThan) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salaryLessThan) {
                System.out.printf("Employee %s: ID: %d, Salary: %d\n", employees[i].getFullName(), employees[i].getId(), employees[i].getSalary());
            }
        }
    }

    public void printByMoreSalary(int salaryMoreThan) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salaryMoreThan) {
                System.out.printf("Employee %s: ID: %d, Salary: %d\n", employees[i].getFullName(), employees[i].getId(), employees[i].getSalary());
            }
        }
    }

    public void removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                employees[i] = null;
                size--;
                System.out.println("Delete success!");
                return;
            }
        }
        System.out.println("An employee with this ID was not found");
        return;
    }

    public void removeEmployeeByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getFullName())) {
                employees[i] = null;
                size--;
                System.out.println("Delete success!");
                return;
            }
        }
        System.out.println("An employee with this name was not found");
        return;
    }

    public void removeEmployeeByNameAndId(String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId() && name.equals(employees[i].getFullName())) {
                employees[i] = null;
                size--;
                System.out.println("Delete success!");
                return;
            }
        }
        System.out.println("An employee with this name and ID was not found");
        return;
    }

    public void changeSalaryByName(String name, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getFullName())) {
                employees[i].setSalary(salary);
            }
        }
    }

    public void changeDepartmentByName(String name, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getFullName())) {
                employees[i].setDepartment(department);
            }
        }
    }

    public void printAllSortedByDepartment() {
        for (int dep = 1; dep <= 5; dep++) {
            System.out.println("\nDepartment " + dep + ":");
            for (int i = 0; i < employees.length; i++) {
                if (dep == employees[i].getDepartment()) {
                    System.out.println(employees[i].getFullName());
                }
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("Employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        return "\nEnd of list";
    }
}