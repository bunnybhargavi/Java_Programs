import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        System.out.println("enter string :");
        int a= sc.nextInt();
        System.out.println("Enter an integer :"+a);
        String s= sc.nextLine();
        System.out.println("Enter any String:"+s);
    }  
}
