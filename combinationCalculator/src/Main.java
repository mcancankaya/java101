import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, combination;
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("n sayısını girin : ");
            n = input.nextInt();

            System.out.print("r sayısını girin : ");
            r = input.nextInt();
            if(n<=0 || r<=0){
                System.out.println("0'dan büyük sayı girmelisiniz.");
                return;
            }
            combination = (factorialCalculator(n)) / ((factorialCalculator(r) * factorialCalculator(n - r)));
            System.out.println("C(" + n + "," + r + ") = " + combination);
        }catch (Exception exception){
            System.out.println("Hata oluştu.");
        }


    }

    private static int factorialCalculator(int number) {
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;
        }
        return total;
    }
}