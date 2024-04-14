// Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan Manager", 70000);
        ((Manager) employees[0]).setNumberOfSubordinates(0);

        employees[1] = new Worker("Katarzyna Worker", 45000);
        employees[2] = new Employee("Piotr Employee", 55000);
        employees[3] = new Worker("Krzysztof Worker", 50000);
        employees[4] = new Worker("Anna Worker", 48000);
        
        employees[5] = new Manager("Dawid Manager", 72000);
        ((Manager) employees[5]).setNumberOfSubordinates(0);
        employees[6] = new Worker("Emilia Worker", 46000);

        for (Employee emp : employees) {
            double newSalary = emp.getSalary() + 500;
            emp.setSalary(newSalary);
        }

        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager) emp).setNumberOfSubordinates(3);
                emp.setSalary(75000);
            }
        }

        System.out.println("Updated data for all employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
