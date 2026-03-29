import java.util.Scanner;
public class Area {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of length");
        int length = s.nextInt();
        System.out.print("Enter the value of breadth :");
        int breadth = s.nextInt();
        int area = length*breadth;
        System.out.println("Area of Rectangle=" +area);

    }
}
