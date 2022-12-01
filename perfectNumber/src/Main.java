import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,total;
        Scanner input = new Scanner(System.in);
        while (true){

            System.out.print("Enter a number :");
            number=input.nextInt();
            if (number==0){
                break;
            }
            total=0;
            for (int i =1;i<number;i++){
                if (number%i==0){
                    total+=i;
                }
            }
            if (total==number){
                System.out.println("Number is perfect : "+number);
            }else {
                System.out.println("Number is not perfect : "+number+" "+total);
            }
        }

    }
}