import java.util.Scanner;

public class FactorialNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        if(n<0)
        {
            System.out.println("Unable to find a Factorial of negative number");
        }
        else{
            System.out.println("Factorial of "+n+" is "+factorial(n));
        }

    }

    private static int factorial(int n) {
        if(n==0  || n==1)
            return 1;
        return n*factorial(n-1);
    }
}
