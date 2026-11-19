
import java.util.Scanner;

class Activity extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("CHAR")) {
            printChar();
        } else {
            printNum();
        }
    }

    void addition() {
        System.out.println("Addition activity started..");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scan.nextInt();
        System.out.println("Enter b ");
        int b = scan.nextInt();
        int res = a + b;
        System.out.println("Addition result is : " + res);
        System.out.println("Addition activity completed..");
    }

    void printChar() {
        System.out.println("Printing char activity started..");
        for (int i = 65; i <= 69; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing char activity Completed..");
    }

    void printNum() {
        System.out.println("Printing num activity started..");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing num activity completed..");
    }
}
