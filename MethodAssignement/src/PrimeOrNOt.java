import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOrNOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int start = sc.nextInt();
        System.out.println("Enter number 2");
        int end = sc.nextInt();
        List<Integer> primes = findPrimeBetween(start,end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primes);
    }

    private static List<Integer> findPrimeBetween(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for(int i=Math.max(start,2);i<=end;i++)
        {
            if(isPrimeNum(i))
            {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrimeNum(int num) {
        if(num<2) return false;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0) return false;

        }
        return true;
    }
}
