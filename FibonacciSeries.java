import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of terms:");
    int n =sc.nextInt();
    int t1=0;
    int t2=1;
    int nextterm=t1+t2;
    System.out.print("Fibonacci Series is " + t1 +" "+ t2);
    for(int i=1 ;i<=n;i++){
      System.out.print(" "+ nextterm);
      t1=t2;
      t2=nextterm;
      nextterm=t1+t2;
    }
  }
}
