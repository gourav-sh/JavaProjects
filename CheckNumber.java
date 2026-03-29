import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of number :");
           int n = s.nextInt();
        if(n >= 0)
        {
           if(n==0)
            System.out.println("Numebr is zero");
        else 
            System.out.println("Numebr is Positive");
        }
            
        else 
            System.out.println("Number is Negative");
    }
}
