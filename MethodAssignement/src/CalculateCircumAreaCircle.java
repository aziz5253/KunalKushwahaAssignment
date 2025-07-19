import java.util.Scanner;

public class CalculateCircumAreaCircle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a Circle");
        int r = sc.nextInt();
        System.out.println("Circumference of a circle is====="+circumference(r));
        System.out.println("Area of a circle is====="+area(r));

    }

    private static double area(int r) {
        return 3.14*r*r;
    }

    private static double circumference(int r) {
        return 2*3.14*r;
    }
}
