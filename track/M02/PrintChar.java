
class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing chae activity started and using a file");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing char activity completed and stoped using file");
    }
}
