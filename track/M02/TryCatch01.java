
import java.util.Scanner;

class TryCatch01 {

    public static void main(String[] args) {

        System.out.println("Connection established");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a : ");

        int a = scan.nextInt();

        System.out.println("Enter b : ");

        int b = scan.nextInt();

        int res = a / b; // compiler will not check UNCHECK EXCEPTIOPN

        System.out.println("Result : " + res);

        System.out.println("Connection terminated..");

    }

}
