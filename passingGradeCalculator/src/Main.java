import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mathGrade, physicsGrade, turkishGrade, chemistryGrade, musicGrade,lessonCount=5;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu girin : ");
        mathGrade = input.nextInt();
        if (mathGrade<0 || mathGrade>100){
            mathGrade=0;
            lessonCount-=1;
        }

        System.out.print("Fizik Notunuzu girin : ");
        physicsGrade=input.nextInt();
        if (physicsGrade<0 || physicsGrade>100){
            physicsGrade=0;
            lessonCount-=1;
        }

        System.out.print("Türkçe Notunuzu girin : ");
        turkishGrade = input.nextInt();
        if (turkishGrade<0 ||turkishGrade>100){
            turkishGrade=0;
            lessonCount-=1;
        }

        System.out.print("Kimya Notunuzu girin : ");
        chemistryGrade = input.nextInt();
        if(chemistryGrade<0||chemistryGrade>100){
            chemistryGrade=0;
            lessonCount-=1;
        }

        System.out.print("Müzik Notunuzu girin : ");
        musicGrade = input.nextInt();
        if(musicGrade<0||musicGrade>100){
            musicGrade=0;
            lessonCount-=1;
        }
        if (lessonCount==0){
            System.out.println("Girilen Ders Notları geçersiz. Ortalama hesaplanamadı.");
            return;
        }
        average = (mathGrade+physicsGrade+turkishGrade+chemistryGrade+musicGrade)/lessonCount;
        if (average>=55){
            System.out.println("Tebrikler Sınıfı Geçtiniz.");
        }else {
            System.out.println("Sınıfta Kaldınız.");
        }
        System.out.println(lessonCount+" derse göre Ortalamanız : "+average);
    }
}