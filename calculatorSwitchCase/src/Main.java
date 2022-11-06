import java.util.Scanner;
/**
    @author Can
 */

public class Main {
    public static void main(String[] args) {

        int number1,number2,operationNumber,result;
        String operations="1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme";

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı girin : ");
        number1=input.nextInt();
        System.out.print("2. Sayıyı girin : ");
        number2 = input.nextInt();

        System.out.print(operations+"\nYapmak istediğiniz işlemi Seçin:");
        operationNumber=input.nextInt();

        switch(operationNumber){

            case 1:
                result=number1+number2;
                System.out.println(number1+" + "+number2+" = "+result);
                break;
            case 2:
                result=number1-number2;
                System.out.println(number1+" - "+number2+" = "+result);
                break;

            case 3:
                result=number1*number2;
                System.out.println(number1+" * "+number2+" = "+result);
                break;

            case 4:
                if (number2==0) {
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                }
                result=number1/number2;
                System.out.println(number1+" / "+number2+" = "+result);
                break;
            default:
                System.out.print("Hatalı işlem");
        }
    }
}