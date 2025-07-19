import java.util.Scanner;

public class Pallindrome {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        System.out.println(isPallindrom(n)?n+" is Pallindrome":n+ " is not Pallindrome");
        isPallindrom(n);
    }

    private static boolean isPallindrom(int n) {
        int original = n;
        int rev=0;
        while(n!=0)
        {
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev==original;
    }
}
