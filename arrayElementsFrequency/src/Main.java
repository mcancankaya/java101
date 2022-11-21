import java.util.Arrays;

public class Main {

    static boolean isFind(int[] array, int value,int x) {
        for (int i=0; i<x;i++) {
            if (value == array[i]) {
                return false;
            }
        }
        return true;
    }

    static int equalCount(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {86,68,92,18,5,18,29,68,86,92,86,5,18,29,30,30,30};
        System.out.println("Array : " + Arrays.toString(numbers));
        System.out.println("Repeating numbers and their quantities");
        for (int i = 0; i < numbers.length; i++) {
            if (isFind(numbers, numbers[i],i)) {
                System.out.println("Number " + numbers[i] +", repeated "+  equalCount(numbers, numbers[i]) + " times.");
            }
        }
    }

}