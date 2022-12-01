import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int piece, maxNumber = 0, minNumber = 0, tempNumber, step = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        piece = input.nextInt();

        while (step <= piece) {
            System.out.print("Enter number :");
            tempNumber = input.nextInt();
            switch (step) {
                case 1:
                    maxNumber = tempNumber;
                    minNumber = maxNumber;
                    step++;
                    continue;
                default:
                    if (tempNumber > maxNumber) {
                        maxNumber = tempNumber;
                    } else if (tempNumber < minNumber) {
                        minNumber = tempNumber;
                    }
                    step++;
            }
        }
        System.out.print("Max number : " + maxNumber + "\nMin number : " + minNumber);
    }
}