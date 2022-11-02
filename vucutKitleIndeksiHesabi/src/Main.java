import java.util.Scanner;

/**
 * @author Can
 * Kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
   Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
   Formül
   Kilo (kg) / Boy(m) * Boy(m)
 */

public class Main {
    public static void main(String[] args) {
        double size,weight,vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        size=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        vki=weight/(size*size);
        System.out.println("Vücut Kitle İndeksiniz : "+vki);

    }
}