import java.util.Scanner;
public class TempFtoC {
  public static void main(String[] args) {
    System.out.println("Enter temperature in Fahrenheit:");
    Scanner sc=new Scanner(System.in);
    float temp =sc.nextFloat();
    float tempc=(temp-32)*5/9;
    System.out.println("Temperature after converting to Celsius:"+tempc);
  }
}
