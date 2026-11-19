
class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing num activity started and using a file");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing num activity completed and stoped using file");
    }
}
