import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total=0,number,count=0;
        boolean status=true;
        Scanner input = new Scanner(System.in);

        while (status){
            System.out.print("Sayı girin : ");
            number = input.nextInt();
            if (number%2==0 && number%4==0){
                total+=number;
                count++;
            }else if(number%2!=0) {
                status =false;
            }
        }
        if (count==0){
            System.out.println("Çift ve 4 ün katı olan sayı girmediniz.");
        }else {
            System.out.print("4 ün katı ve çift sayı adedi : "+count+"\nBu sayıların toplamları : "+total);
        }

    }
}