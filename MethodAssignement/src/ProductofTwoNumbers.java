import java.util.Scanner;

public class ProductofTwoNumbers {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Product of two numbers "+num1+" and "+num2+" is "+productOfTwoNumber(num1,num2));
    }

    private static int productOfTwoNumber(int num1, int num2) {
        return num1 * num2;
    }
}
