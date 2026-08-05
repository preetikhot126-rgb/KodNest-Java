
public class PlacementEligible {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean projectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendenceEligible = attendance >= 75;
        boolean academicEligible = marksEligible && attendenceEligible;
        boolean placementEligible = academicEligible && projectCompleted;
        System.out.println("Placement Eligible: " + placementEligible);
    }
}
