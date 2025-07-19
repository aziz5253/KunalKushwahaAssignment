import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println(isPrime(n)?"The Number is Prime":"The Number is not Prime");

    }

    private static boolean isPrime(int n) {
        int c = 2;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>n;
    }

}
