import java.util.Scanner;
public class RectangleArea {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length and breadth of a Rectangle:");
    float len=sc.nextFloat();
    float bre=sc.nextFloat();
    float Area=len*bre;
    float Perimeter=2*(len+bre);
    System.out.println("Area of Rectangle" +Area);
    System.out.println("Perimeter of Rectangle" +Perimeter);
  }
}
