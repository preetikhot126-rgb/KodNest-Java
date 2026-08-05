
public class placement 

    Eligible {
    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        int projectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendenceEligible = attendance >= 75;
        boolean acadeicEligible = marksEligible && attendenceEligible;
        boolean placementEligible = academicEligible && projectCopleted;
        System.out.println("Placement Eligible: " + placementEligible);
    }
}
