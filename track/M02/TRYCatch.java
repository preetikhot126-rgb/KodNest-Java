
import java.util.Scanner;

class TRYCatch {

    public static void main(String[] args) {
        System.out.println("Connection estabished");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
            System.out.println("Divide by ZERO");
        }
        System.out.println("Cnnection terminated..");
    }
}
