import java.util.Scanner;
/*
Hava sıcaklığına göre aktivite öneren program.
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
* */
public class Main {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını girin : ");
        temperature=input.nextInt();
        if (temperature>=0 && temperature<5 ){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature>=5 && temperature<15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temperature>=15 &&temperature<=25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (temperature>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }else {
            System.out.println("Hatalı sıcaklık değeri.");
        }

    }
}