import java.util.Scanner;
public class GreatestThree {
    public static void main(Scanner[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers one by one");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        if((n1 > n2) && (n1>n3))
            System.out.println("n1 is the biggest number");
        else if((n2>n1) && (n2>n3))
             System.out.println("n2 is the largest");
        else
            System.out.println("n3 is the largest one");
    }
}
