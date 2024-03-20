import java.util.Scanner;
public class LargerOfNumbers{
  public static void main(String[] args) {
    int comp,large;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any three numbers to larger of them :");
    int a =sc.nextInt();
    int b=sc.nextInt();
    int c =sc.nextInt();
    comp=a>b?a:b;
    large=comp>c?comp:c;
    System.out.println("Larger of three numbers is "+large);
  }
}