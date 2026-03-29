import java.util.Scanner;
  public class report {
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the roll number : ");
    int n = s.nextInt();
    s.nextLine();
    System.out.println("Enter the Name of student : ");
    String name = s.nextLine();
    System.out.println("Marks in A : ");
    int m = s.nextInt();
    System.out.println("Marks in B : ");
    int p = s.nextInt();
    System.out.println("Marks in C : ");
    int q = s.nextInt();
    System.out.println("Total Marks Obtained :" +(m+p+q));
    System.out.println("Average Marks Obtained : " +(m+p+q)/3);
  }
}
