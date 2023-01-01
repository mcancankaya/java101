import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number3 = input.nextInt();

        for(int i = 1; i < number3; ++i) {
            if (i == 1) {
                System.out.print("" + number1 + " " + number2);
            }

            int tempNumber = number1 + number2;
            System.out.print(" " + tempNumber);
            number1 = number2;
            number2 = tempNumber;
        }
    }
}
