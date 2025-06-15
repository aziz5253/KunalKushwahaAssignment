import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Sum of two numbers "+num1+" and "+num2+" is "+sumOfTwoNumber(num1,num2));
    }

    private static int sumOfTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
}
