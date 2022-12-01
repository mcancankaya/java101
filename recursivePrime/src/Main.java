import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    static boolean isPrime(int number, int i ){
        if (number <= 2){
            return (number == 2) ? true : false;
        }
        if (number % i == 0){
            return false;
        }
        if (i * i > number){
            return true;
        }

        return isPrime(number,i+1);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter a number : ");
            number = input.nextInt();
            if (isPrime(number,2)){
                System.out.println("Number is prime : "+number);
            }else {
                System.out.println("Number is not prime : "+number);
            }
        }

    }
}