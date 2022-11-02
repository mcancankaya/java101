import java.util.Scanner;

/**
 * @author Can
 * Üç Kenar Uzunluğu kullanıcıdan alınan üçgenin alanını hesaplama programı
 * Formül
   Üçgenin çevresi = 2u
   u = (a+b+c) / 2
   Alan * Alan = u * (u − a)* (u − b) * (u − c)
 */
public class Main {
    public static void main(String[] args) {
        int sideA,sideB,sideC, perimeter,u;
        double area;
        /**
         * @param perimeter - Çevre
         * @param area - Alan
         */
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar uzunluğunu gir : ");
        sideA=input.nextInt();
        System.out.print("2. Kenar uzunluğunu gir : ");
        sideB=input.nextInt();
        System.out.print("3. Kenar uzunluğunu gir : ");
        sideC=input.nextInt();


        u = (sideA+sideB+sideC)/2;
        perimeter=u*2;
        area = Math.sqrt(u*(u-sideA)*(u-sideB)*(u-sideC));

        System.out.println("Üçgenin Çevresi : "+perimeter+"\nÜçgenin Alanı : "+area);
    }
}