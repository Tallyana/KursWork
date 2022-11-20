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
        System.out.println("Средняя зарплата сотрудника  " + maxSalary());
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
                employees++;
            }
    }
        return

    sumSalaries()/counterKolichvo;
}
}

