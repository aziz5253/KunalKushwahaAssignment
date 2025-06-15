import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number");
        int num3 = sc.nextInt();
        System.out.println(checkPythagoreanTriplet(num1,num2,num3));
    }

    private static boolean checkPythagoreanTriplet(int num1, int num2, int num3) {
        return Math.pow(num3, 2) == Math.pow(num1, 2) + Math.pow(num2, 2);
    }
}
