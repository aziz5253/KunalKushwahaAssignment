import java.util.Scanner;

public class VotingRights {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Person");
        int age = sc.nextInt();
        System.out.println(isEligibleForVote(age)?"The Person is eligible to vote":"The Person is not eligible to vote");
    }

    private static boolean isEligibleForVote(int age) {
        return age>=18;
    }
}
