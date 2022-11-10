import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Yıl giriniz : ");
            year = input.nextInt();
            leapYearCalculator(year);

        }catch (Exception exception){
            System.out.print("Hatalı değer.");
        }
    }

    private static void leapYearCalculator(int year) {
        if (year %100==0 &&year%400==0) {
            System.out.println(year +" artık bir yıldır.");
        }else if (year %4==0 && year%100!=0){
            System.out.println(year +" artık bir yıldır.");
        }else {
            System.out.println(year+" artık bir yıl değildir.");
        }
    }
}