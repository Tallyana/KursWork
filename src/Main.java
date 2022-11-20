public class Main {
    private static Employees[] employees;

    public static void main(String[] args) {
        employees = new Employees[10];
        employees[0] = new Employees("Сидоров Олег Иванович ", "Второй", 28325.0);
        employees[1] = new Employees("Зотова Ирина Владимировна ", "Четвертый", 37000.0);
        employees[2] = new Employees("Петров Валентин Васильевич ", "Первый", 22700.0);
        printArray();
        System.out.println("Сумма зарплат всех сотрудников - " + sumSalaries());
    }

    public static void printArray() {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
    }

    public static double sumSalaries() {
        double summa = 0;
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                summa += employees[i].getSalary();
            }
        return summa;
    }
}


