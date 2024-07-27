// 素数
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static List<Integer> generate(Integer count) {
        List<Integer> primes = new ArrayList<>();

        if (count < 1) {
            return primes;
        }

        int number = 2;
        while (primes.size() < count) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of primes to generate: ");
        int count = scanner.nextInt();
        scanner.close();

        List<Integer> primes = generate(count);
        for (int i = 0; i < primes.size(); i++) {
            System.out.println((i + 1) + ":" + primes.get(i));
        }
    }
}
