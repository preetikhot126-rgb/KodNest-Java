
public class Main1 {

    public static void main(String[] args) {
        System.out.println("Main Thread started and Opened a file");
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();
        ad.start();
        pn.start();
        pc.start();
        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread execution completed and closed a file");
    }
}
