import java.util.Scanner;

public class PosOrNegNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter any Integer:");
    int num=sc.nextInt();
    if (num>0)
    {
      System.out.println("Number is Positive");
    }
    else if (num==0)
    {
      System.out.println("Number is Zero");
    }
    else if(num<0)
    {
      System.out.println("Number is Negative");
    }
  }
}
