package Employee;

public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee("Sharan", 400, 41000);
        Employee p2 = new Employee("Karan", 401, 42000);

        System.out.println("Initial employee details are:");
        p1.display();
        p2.display();

        p1.increase_salary(20);
        p2.increase_salary(30);

        System.out.println("Updated employee details are:");
        p1.display();
        p2.display();
    }
}