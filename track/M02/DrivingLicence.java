
import java.util.*;

class DrivingLicence {

    int age;

    void takeUserAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
    }

    void verify() throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else {
            System.out.println("DrivingLicence will be issued.....");
        }
    }
}
