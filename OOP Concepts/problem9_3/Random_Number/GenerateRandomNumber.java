import java.security.SecureRandom;
import java.util.Scanner;

public class GenerateRandomNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        generateRandomNumbers(n);

        scanner.close();
    }

    private static void generateRandomNumbers(int n) {
        SecureRandom random = new SecureRandom();

        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(91) + 10; 
            System.out.println(randomNumber);
        }
    }
}
