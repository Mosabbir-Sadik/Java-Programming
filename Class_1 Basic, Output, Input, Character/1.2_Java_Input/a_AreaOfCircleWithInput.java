import java.util.Scanner;

public class a_AreaOfCircleWithInput {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the radius: ");
    int radius;
    radius = sc.nextInt();
    double pi = 3.1416;
    double area = pi*(radius*radius);
    System.out.println("The area of the circle is: "+area);
    }
}