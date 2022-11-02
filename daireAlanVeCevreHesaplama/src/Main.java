import java.util.Scanner;

/**
 * @author Can

 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
   𝜋 sayısını = 3.14 alınız.
   Formül : (𝜋 * (r*r) * 𝛼) / 360
 */


public class Main {
    public static void main(String[] args) {
        double pi=3.14,r,a,circleSliceArea;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        r= input.nextDouble();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a=input.nextDouble();

        circleSliceArea=(pi*(r*r)*a)/360;
        System.out.print("Daire diliminin alanı : "+circleSliceArea);

    }
}