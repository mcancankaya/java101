import java.util.*;

public class Main {
    static int randomNumber(){
        Random random = new Random();
        return  random.nextInt(100);
    }
    public static void main(String[] args) {
        int number,guessNumber,right=0;
        int[] wrong = new int[5];
        boolean isWin=false,isWrong=false;
        Scanner input = new Scanner(System.in);

        number=randomNumber();

        while (right<5){
            System.out.print("Enter your guess number : ");
            guessNumber = input.nextInt();

            if (guessNumber>100 || guessNumber<0){
                System.out.println("Invalid number. Please enter number between 1-100");
                if (isWrong){
                    right++;
                    System.out.println("Incorrect entry. remaining right : "+(5-right));
                }else{
                    isWrong=true;
                }
                continue;
            }
            if (guessNumber==number){
                System.out.println("Congratulations correct number guessing. Number : "+number );
                isWin=true;
                break;
            }else {
                System.out.println("Incorrect Entry.");
                if (guessNumber<number){
                    System.out.println(guessNumber+" greater than a hidden number.");
                } else {
                    System.out.println(guessNumber+" less than a hidden number.");
                }
                wrong[right++]=guessNumber;
                System.out.println("Remaining Right : "+(5-right));
            }
        }
        if (!isWin){
            System.out.println("You Lost !");
            if (!isWrong){
                System.out.println("your predictions : "+Arrays.toString(wrong)+"\nHidden Number : "+number);
            }
        }
    }
}