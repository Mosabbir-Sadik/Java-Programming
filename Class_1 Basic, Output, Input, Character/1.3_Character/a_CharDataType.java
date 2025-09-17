import java.util.Scanner;

public class a_CharDataType {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a character: ");
    char ch;
    ch=sc.next().charAt(0);
        System.out.println(ch);
    }
}
