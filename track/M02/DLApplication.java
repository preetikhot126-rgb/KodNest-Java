
class DLApplication {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();
        try {
            dl.verify();
        } catch (UnderAgeException e1) {
            e1.printStackTrace();
        }
    }
}
