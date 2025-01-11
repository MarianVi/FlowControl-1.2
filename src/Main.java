import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        int sum = 0;
        while (numar != 0) {
            int lastDigit = numar % 10;
            sum += lastDigit;
            numar /= 10;
        }
        System.out.println("Suma cifrelor este: " + sum);
    }
}