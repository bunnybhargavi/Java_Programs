import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
  public static void main(String[] args) {
    int orgnum,r,n,num,sum=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of digits:");
    n=sc.nextInt();
    System.out.println("Enter number:");
    num=sc.nextInt();
    orgnum =num;
    while(num>0){
      r = num%10;
      sum += (Math.pow(r,n));
      num=num/10;
    }
    if(orgnum==sum){
      System.out.println("armstrong Number");
    }
    else{
      System.out.println("Not an Armstrong Number");
    }
      
  }
}
