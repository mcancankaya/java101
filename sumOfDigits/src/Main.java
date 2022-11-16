import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0, tempNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            total += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.print(number + " sum of digits = " + total);
    }
}