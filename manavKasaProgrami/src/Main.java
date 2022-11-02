import java.util.Scanner;

/**
 * @author Can
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin
   kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 * Meyveler ve KG Fiyatları
    * Armut : 2,14 TL
    * Elma : 3,67 TL
    * Domates : 1,11 TL
    * Muz: 0,95 TL
    * Patlıcan : 5,00 TL
 */
public class Main {
    public static void main(String[] args) {
        final double perPearPrice=2.14,perApplePrice=3.67,perTomatoPrice=1.11,perBananaPrice=0.95,perAuberginePrice = 5.00;
        double pearQuantity, appleQuantity,tomatoQuantity,bananaQuantity,aubergineQuantity,totalAmount;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        pearQuantity=input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        appleQuantity=input.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        tomatoQuantity=input.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        bananaQuantity=input.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        aubergineQuantity=input.nextDouble();

        totalAmount=(pearQuantity*perPearPrice)+(perApplePrice*appleQuantity)+(perTomatoPrice*tomatoQuantity)+(perBananaPrice*bananaQuantity)+(perAuberginePrice*aubergineQuantity);

        System.out.print("Toplam Tutar : "+totalAmount+" TL");
    }
}