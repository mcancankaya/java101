import java.util.Scanner;

public class Main {

    static int power(int baseNumber,int expNumber){
        if (expNumber!=0){
            return (baseNumber*power(baseNumber,expNumber-1));
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int baseNumber,expNumber;

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter the base number : ");
            baseNumber=input.nextInt();
            System.out.print("Enter the exp number : ");
            expNumber=input.nextInt();
            System.out.println("Result : "+power(baseNumber,expNumber));
        }
    }
}