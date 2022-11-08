import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int type,distance,age;
        double perDistancePrice=0.10,discountedPrice=0,price,finalPrice,ageDiscountedAmount,
        roundTripDiscount;
        String errorMessage="Hatalı Veri Girdiniz!";

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden girin : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı girin : ");
        age= input.nextInt();
        System.out.println("Yolculuk Tipini Seç (1 -> Tek Yön 2 -> Gidiş - Dönüş) : ");
        type =input.nextInt();

        if (distance>0){
            price = distance*perDistancePrice;

            if (age<12){
                ageDiscountedAmount = price*0.50;
                discountedPrice = price-ageDiscountedAmount;
            } else if (age>=12 && age<=65) {
                if (age<=24){
                    ageDiscountedAmount = price*0.10;
                    discountedPrice = price-ageDiscountedAmount;
                }else {
                    discountedPrice=price;
                }
            } else if (age>65) {
                ageDiscountedAmount=price*0.30;
                discountedPrice = price-ageDiscountedAmount;
            }else {
                System.out.println(errorMessage);
            }

            finalPrice=discountedPrice;

            switch (type){
                case 1:
                    System.out.println("Toplam Tutar : "+finalPrice);
                    break;
                case 2:
                    roundTripDiscount = discountedPrice*0.20;
                    finalPrice-=roundTripDiscount;
                    System.out.println("Toplam Tutar : "+finalPrice*2);
                    break;
                default:
                    System.out.println(errorMessage);
            }
        }else {
            System.out.println(errorMessage);
        }



    }
}