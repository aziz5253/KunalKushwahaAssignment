import java.util.Scanner;

public class FirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n");
        int n = sc.nextInt();
        firstNNatural(n);
    }

    private static void firstNNatural(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++)
        {
           sum +=i;
        }
        System.out.println("Sum of First "+n+" natural number is "+sum);
    }
}
