import java.util.Scanner;
public class SwapNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.err.println("Enter any to integers:");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int temp=x;
    x=y;
    y=temp;
    System.out.println("numbers after swap is :");
    System.out.println(x);
    System.out.println(y);
  }
}
