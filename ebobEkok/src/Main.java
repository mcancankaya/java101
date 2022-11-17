import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1,number2,k=0, ebob=0, ekok=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        number1 = input.nextInt();
        System.out.print("Enter the second number : ");
        number2 = input.nextInt();

        if (number1<number2){
            k=number1;
        }else {
            k=number2;
        }
        int i=1;
        while (i<=k){
            if (number1%i==0 && number2%i==0){
                ebob=i;
            }
            i++;
        }
        int j=1;
        while (j<=(number1*number2)){
            if (j%number1==0 && j%number2==0){
                ekok =j;
                break;
            }
            j++;
        }
        System.out.println("Ebob : "+ebob+"\nEkok : "+ekok);
    }
}