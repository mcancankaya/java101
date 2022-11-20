import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,6,7,4,3};
        double harmonicSeries=0,average,sum=0;

        for (int number :numbers) {
            harmonicSeries=0;
            for (double i = 1; i <= number; i++) {
                harmonicSeries += (1 / i);
            }
            average = numbers.length/harmonicSeries;
            System.out.println("element  : "+number+" Harmonic Average : "+average);
        }
        

    }
}