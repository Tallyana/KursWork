public class Employees {
    private String fullName;
    private String department;
    private double salary;
    private static int counter = 0;
    private final int id;
    public Employees(String fullName, String department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String toString() {
        return  "Id сотрудника:" + id+ "."+ fullName +"; " + department + " отдел;" + " Оклад:"+ salary;
    }
}
