import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MethodAssignment {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number");
       int num1 = sc.nextInt();
       System.out.println("Enter Second Number");
       int num2 = sc.nextInt();
       System.out.println("Enter Third Number");
       int num3 = sc.nextInt();
       System.out.println("Maximum of three numbers "+num1+","+num2+","+num3+"  is "+maximum(num1,num2,num3));
       System.out.println("Minimum of three numbers "+num1+","+num2+","+num3+" is "+minimum(num1,num2,num3));

    }

    private static int minimum(int num1, int num2, int num3) {
        return Math.max(Math.max(num1,num2),num3);
    }

    private static int maximum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1,num2),num3);
    }
}