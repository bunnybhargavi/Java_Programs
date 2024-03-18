import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any Number");
    int num=sc.nextInt();
    int org_num=num;
    int rev_num=0;
    while(num>0){
      rev_num=rev_num*10+num%10;
      num=num/10;
    }
    if(org_num==rev_num){
      System.out.println("Entered number is a PALINDROME");
    }
    else{
      System.out.println("entered number is NOT a Palindrome");
    }
  }
}
