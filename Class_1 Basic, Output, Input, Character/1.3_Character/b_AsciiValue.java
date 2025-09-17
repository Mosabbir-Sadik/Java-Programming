import java.util.Scanner;
public class b_AsciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        int x = (int)ch;
        System.out.println("The ASCII Value: "+x);
    }
}
