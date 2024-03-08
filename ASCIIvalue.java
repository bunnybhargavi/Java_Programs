import java.util.Scanner;

public class ASCIIvalue {
  public static void main(String[] args) {
    System.out.println("Enter any character");
    Scanner sc= new Scanner(System.in);
    char ch= sc.next().charAt(0);
    int asciival=ch;
    System.out.println("ASCII value of " + ch +" is:"+asciival);
  }
}
