import java.util.Scanner;

public class c_FindReminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend=sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor=sc.nextInt();

        int reminder=dividend % divisor;
        System.out.println("The reminder number is: "+reminder);
    }
}
