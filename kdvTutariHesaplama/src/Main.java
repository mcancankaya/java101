import java.util.Scanner;

/**
 * @author Can

 * KDV Tutarı hesaplayan Program
   Java ile kullanıcıdan alınan para değerinin
   KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
   (Not : KDV tutarını 18% olarak alın)
   KDV'siz Fiyat = 10;
   KDV'li Fiyat = 11.8;
   KDV tutarı = 1.8;

*/

public class Main {
    public static void main(String[] args) {
        double price,kdvRatioBetween0_1000=0.18,kdvRatioGreaterThan1000=0.08,kdvAmount,priceOfKDV;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat Giriniz : ");
        price=input.nextDouble();

        /**
         @param kdvAmount - Kdv Tutarı
         @param priceOfKDV - KDV'li Tutar
         */
        kdvAmount=price>0&&price<=1000? (price*kdvRatioBetween0_1000):(price*kdvRatioGreaterThan1000);
        priceOfKDV= price+kdvAmount;

        System.out.println("Fiyat: "+price+"\nKDV Tutarı : "+kdvAmount+"\nKDV'li Tutar : "+priceOfKDV);
    }
}