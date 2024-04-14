// Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Manager", 70000);
        employees[1] = new Worker("Piotr Worker", 45000);
        employees[2] = new Employee("Krzysztof Employee", 55000);
        employees[3] = new Worker("Anna Worker", 50000);
        employees[4] = new Worker("Katarzyna Worker", 48000);

        int nonManagerCount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);
        }

        employees[0].setSalary(75000);

        System.out.println("Data for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
