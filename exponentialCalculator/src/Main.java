import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int baseNumber, exponentNumber;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter base number : ");
            baseNumber = input.nextInt();
            System.out.print("Enter exponent number : ");
            exponentNumber = input.nextInt();
            if (exponentNumber<0){
                System.out.print("Just enter a positive exponent");
                return;
            }

            System.out.println(baseNumber + " ^ " + exponentNumber + " = " + exponentResultCalculator(baseNumber, exponentNumber));

        }catch (Exception exception){
            System.out.print("An error occurred");
        }


    }

    private static int exponentResultCalculator(int baseNumber, int exponentNumber) {

        int result = 1;
        if (exponentNumber == 0) {
            return result;
        }
        for (int i = 1; i <= exponentNumber; i++) {
            result *= baseNumber;
        }
        return result;
    }
}