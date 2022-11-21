import java.util.Arrays;

public class Main {
    static boolean isFindValue(int[] array,int value){
        for (int i :
                array) {
            if (i==value) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,12,5, 5, 4,5,8, 8, 2 ,10,10};
        int[] evenAndDuplicateNumbers= new int[numbers.length];
        int startIndex=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i!=j) &&(numbers[i]==numbers[j]) && (numbers[i]%2==0)){
                    if (!isFindValue(evenAndDuplicateNumbers,numbers[i]))
                        evenAndDuplicateNumbers[startIndex++]=numbers[i];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(evenAndDuplicateNumbers));
    }
}