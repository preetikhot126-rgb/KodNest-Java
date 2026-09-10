import java.util.Scanner;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        char a[] = str.toCharArray();
        char newa[] = new  char[a.length];
        int j = newa.length - 1;
        for(int i = 0; i <= a.length-1; i++) {
            newa[j] = a[i];
            j--;
        }
        String revstr = new String(newa);
        System.out.println("Original string is: " + str);
        System.out.println("Reversed string is: " + revstr);


    }
}