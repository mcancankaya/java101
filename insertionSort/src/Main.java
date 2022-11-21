import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j,size,value;
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        size = input.nextInt();

        int[] array = new int[size];
        System.out.println("Array size : "+size);
        for (int i = 1;i<=size;i++){
            System.out.print("Enter "+i+". number  : ");
            array[i-1]= input.nextInt();
        }

        for (int i=1;i<size;i++){
            value=array[i];

            for ( j=i-1;j>=0 && array[j]>value;j--){
                array[j+1]=array[j];
            }
            array[j+1]=value;

        }

        System.out.println("---------");
        for (int i :array) {
            System.out.print(i+",");
        }
    }
}