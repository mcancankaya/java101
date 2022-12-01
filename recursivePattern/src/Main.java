import java.util.Scanner;

public class Main {
    static void patternMethod(int number, int step, boolean flag) {
        if (number <= 0) {
            flag = false;
        }
        System.out.print(number + " ");
        if (flag) {
            patternMethod(number - 5, step + 1, flag);
        } else {
            if (step == 0) {
                System.out.println();
                return;
            }
            patternMethod(number + 5, step - 1, flag);
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number : ");
            number = input.nextInt();
            patternMethod(number, 0, true);
        }
    }
}