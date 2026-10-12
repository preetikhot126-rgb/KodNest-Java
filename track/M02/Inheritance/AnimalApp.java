
public class AnimalApp {

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        m.sleep();
        Tiger t = new Tiger();
        t.eat();
        t.sleep();
    }
}



import java.util.Scanner;


class Employee {

    public void displayRole(String role) {
        System.out.println("Employee " + role);
    }
}

class Developer extends Employee {

    @Override
    public void displayRole(String role) {
        System.out.println("Developer " + role);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.next();

        Developer developer = new Developer();
        developer.displayRole(role);
    }
}
