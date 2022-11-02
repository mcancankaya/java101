import java.util.Scanner;

/**
 * @author Can
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    * Taksimetre KM başına 2.20 TL tutmaktadır.
    * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    * Taksimetre açılış ücreti 10 TL'dir.
 */

public class Main {
    public static void main(String[] args) {
        int distanceKM;
        double perKM=2.20, totalPrice, startPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.print("KM Değerini girin: ");
        distanceKM=input.nextInt();

        totalPrice=(distanceKM*perKM);
        totalPrice+=startPrice;
        totalPrice= (totalPrice<20)?20:totalPrice;

        System.out.println("Mesafe : "+distanceKM+"\nKM Başına ücret : "+perKM+"\nAçılış Ücreti :"+startPrice+"\nToplam Tutar : "+totalPrice);
    }
}