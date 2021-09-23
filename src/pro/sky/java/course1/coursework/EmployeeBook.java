package pro.sky.java.course1.coursework;


public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook(int length) {
        employees = new Employee[length];
    }

    private int findFreeIndex() {
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
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee getMinSalaryEmployee() {
        int minSalary = employees[0].getSalary();
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee getMaxSalaryEmployee() {
        int maxSalary = employees[0].getSalary();
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double getAverageSalary() {
        return sumSalary() / size;
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }

    public void indexingSalary(int percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            int increase = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + increase);
        }
        System.out.println("Indexing complete!");
    }

    public Employee getMinSalaryByDepartment(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
        }
        if (minSalaryEmployee == null) {
            System.out.println("No employees in department " + department);
            return null;
        }
        return minSalaryEmployee;
    }

    public Employee getMaxSalaryByDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }
        if (maxSalaryEmployee == null) {
            System.out.println("No employees in department " + department);
            return null;
        }
        return maxSalaryEmployee;
    }


    public int getSumSalaryByDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double getAverageSalaryByDepartment(int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                count++;
            }
        }
        return getSumSalaryByDepartment(department) / count;
    }

    public void indexingSalaryByDepartment(int percent, int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
            }
        }
        System.out.println("Indexing complete!");
    }

    public void printByDepartment(int department) {
        System.out.println("Department number " + department);
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                System.out.printf("Employee %s: ID: %d, Salary: %d\n", employee.getFullName(), employee.getId(), employee.getSalary());
            }
        }
    }

    public void printByLessSalary(int salaryLessThan) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salaryLessThan) {
                System.out.printf("Employee %s: ID: %d, Salary: %d\n", employee.getFullName(), employee.getId(), employee.getSalary());
            }
        }
    }

    public void printByMoreSalary(int salaryMoreThan) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salaryMoreThan) {
                System.out.printf("Employee %s: ID: %d, Salary: %d\n", employee.getFullName(), employee.getId(), employee.getSalary());
            }
        }
    }

    public void removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (id == employees[i].getId()) {
                employees[i] = null;
                size--;
                System.out.println("Delete success!");
                return;
            }
        }
        System.out.println("An employee with this ID was not found");
    }

    public void removeEmployeeByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (name.equals(employees[i].getFullName())) {
                employees[i] = null;
                size--;
                System.out.println("Delete success!");
                return;
            }
        }
        System.out.println("An employee with this name was not found");
    }

    public void removeEmployeeByNameAndId(String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (id == employees[i].getId() && name.equals(employees[i].getFullName())) {
                employees[i] = null;
                size--;
                System.out.println("Delete success!");
                return;
            }
        }
        System.out.println("An employee with this name and ID was not found");
    }

    public void changeSalaryByName(String name, int salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (name.equals(employee.getFullName())) {
                employee.setSalary(salary);
            }
        }
    }

    public void changeDepartmentByName(String name, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (name.equals(employees[i].getFullName())) {
                employees[i].setDepartment(department);
            }
        }
    }

    public void printAllSortedByDepartment() {
        for (int dep = 1; dep <= 5; dep++) {
            System.out.println("\nDepartment " + dep + ":");
            for (Employee employee : employees) {
                if (employee == null) {
                    continue;
                }
                if (dep == employee.getDepartment()) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            sb.append(employees[i].toString() + "\n");
        }
        String employees = sb.toString();
        return employees;
    }
}