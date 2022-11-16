import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of lines : ");
        n = input.nextInt();
        for (int i = 1; i<=n;i++){
            for (int k =1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++){
            for (int k =1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=(i*2)-1;j<=(n*2)-3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}