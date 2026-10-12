
class studentApp {

    public static void main(String[] args) {
        student s1 = new student(11, "Arjun");
        student s2 = new student(12, "Raju");
        student s3 = new student(11, "Arjun");
        s1.display();
        s2.display();
        s3.display();
        System.out.println(s1.equals(s2));
        System.out.println("----------");
        System.out.println(s1.equals(s3));
    }
}
