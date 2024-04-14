// Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John Manager", 70000);
        ((Manager) employees[0]).setNumberOfSubordinates(0);

        employees[1] = new Worker("Jane Worker", 45000);
        ((Worker) employees[1]).setPosition("Assistant");

        employees[2] = new Employee("Alice Employee", 55000);

        employees[3] = new Worker("Bob Worker", 50000);
        ((Worker) employees[3]).setPosition("Technician");

        employees[4] = new Worker("Emily Worker", 48000);
        ((Worker) employees[4]).setPosition("Clerk");

        System.out.println("Data for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
