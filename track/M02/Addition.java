
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        System.out.println("Addition activity started and using a file");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition Result is: " + c);
        System.out.println("Addition activity completed and stopped using the file");
    }
}
