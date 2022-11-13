import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin : ");
        number = input.nextInt();

        if (number<1){
            System.out.println("1 den küçük değer giremezsiniz.");
            return;
        }

        System.out.print("4'ün kuvvetleri : ");
        for (int i =1;i<=number;i*=4){
            System.out.print(i+",");
        }

        System.out.print("\n5'in kuvvetleri : ");
        for (int i =1; i<=number;i*=5){
            System.out.print(i+",");
        }
    }
}