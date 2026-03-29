import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number You want to check whether it is even or odd :");
        int Num = s.nextInt();
        int test = Num%2;
        
        if(test==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is odd");


    }
}