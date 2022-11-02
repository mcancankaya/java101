import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create variables
        int matematik, fizik, kimya, turkce, tarih, muzik, toplam;
        boolean durum;

        //Scanner instance created
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();

        toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);


        durum = sonuc >= 60;
        System.out.println(durum ? "Sınıfı Geçti." : "Sınıfta Kaldı.");
    }
}