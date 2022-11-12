import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, count = 0, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0) {
                count++;
                total += i;
            }
        }

        writeToResultByCondition(number, count, total);
    }

    private static void writeToResultByCondition(int number, int count, int total) {
        double average;

        if (count == 0) {
            System.out.println("1-" + number + " arasında  3 ve 4 e ortak bölünebilen sayı bulunamadı.");
        } else {
            average = total / count;
            System.out.println("Ortak Bölünebilen sayı adeti : " + count + "\nBölünebilen sayıların ortalaması : " + average);
        }
    }
}