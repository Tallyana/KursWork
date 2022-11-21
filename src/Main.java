public class Main {
    private static Employees[] employees;

    public static void main(String[] args) {
        employees = new Employees[10];
        employees[0] = new Employees("Сидоров Олег Иванович ", "Второй", 28325.0);
        employees[1] = new Employees("Зотова Ирина Владимировна ", "Четвертый", 37000.0);
        employees[2] = new Employees("Петров Валентин Васильевич ", "Первый", 22700.0);
        printArray();
        System.out.println("Сумма зарплат всех сотрудников - " + sumSalaries());
        System.out.println("Сотрудник с минимальной зарплатой. " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой. " + maxSalary());
        System.out.printf("Средняя зарплата сотрудников:%.2f\n ", averageSalaries());
        printFullName();
        deleteEmployees("Сидоров Олег Иванович");
        printArray();
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


    public static Employees minSalary() {
        Employees summa = employees[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                summa = employees[i];
            }
        return summa;
    }

    public static Employees maxSalary() {
        Employees summa = employees[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                summa = employees[i];
            }
        return summa;
    }

    public static double averageSalaries() {
        int counterKolichvo = 0;
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                counterKolichvo++;
            }
        return sumSalaries() / counterKolichvo;
    }

    public static void printFullName() {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
    }

    public static boolean deleteEmployees(String fullName) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                return true;
            }
        return false;
    }
}



