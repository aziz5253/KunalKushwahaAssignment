import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(isEvenNumberOrOdd(n) ? "The Given Number " + n + " is Even" : "The Given Number " + n + " is Odd");
    }

    private static boolean isEvenNumberOrOdd(int n) {
        return n%2==0;
    }
}
