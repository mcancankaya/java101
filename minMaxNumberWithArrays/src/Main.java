import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{15,12,788,1,-1,-778,2,0};
        int number,minNumber=0,maxNumber=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        Arrays.sort(numbers);

        for (int i=0; i<numbers.length;i++) {
            if (numbers[i]<=number){
                minNumber=numbers[i];
                maxNumber=numbers[i+1];
            }

        }

        System.out.println("The nearest number smaller than the entered number : "+minNumber);
        System.out.println("The nearest number greater than the entered number : "+maxNumber);
    }
}