// Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan Kowalski", 50000);
        employees[1] = new Employee("Katarzyna Kowalczyk", 60000);
        employees[2] = new Employee("Piotr Mazur", 55000);
        employees[3] = new Employee("Krzysztof Lewandowski", 52000);
        employees[4] = new Employee("Anna Wojnowska", 58000);

        System.out.println("Data for employee at index 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(55000);

        System.out.println("\nData for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
