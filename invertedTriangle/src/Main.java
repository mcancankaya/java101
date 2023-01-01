import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        number=input.nextInt();

        for (int i = 1; i<=number; i++){
            for (int k =1;k<i;k++){
                System.out.print(" ");
            }
            for (int j=(i*2);j<=(number*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}