import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "java101", password = "patika123", userNameToCheck, passwordToCheck, operation, newPassword;
        boolean status = true;
        Scanner input = new Scanner(System.in);
        while (status) {

            System.out.print("Kullanıcı Adı : ");
            userNameToCheck = input.nextLine();
            System.out.print("Şifre : ");
            passwordToCheck = input.nextLine();

            if (userNameToCheck.equals(userName) && passwordToCheck.equals(password)) {
                System.out.println("Giriş Başarılı!\nHoşgeldin " + userName);
                status = false;
            } else {
                System.out.print("Bilgileriniz Yanlış !\nŞifrenizi değiştirmek istermisiniz? 'E' : Evet 'H' : Hayır\n");
                operation = input.nextLine();

                switch (operation.toUpperCase()) {
                    case "E":
                        while (true) {
                            System.out.print("Yeni şifrenizi girin : ");
                            newPassword = input.nextLine();
                            if (newPassword.equals(password) || newPassword.equals(passwordToCheck)) {
                                System.out.println("Şifre oluşturulamadı. Tekrar Deneyin.");
                            } else {
                                password = newPassword;
                                System.out.println("Şifre oluşturuldu");
                                break;
                            }
                        }
                        break;

                    case "H":
                        System.out.println("Şifre değiştirme talebi reddedildi.");
                        break;
                    default:
                        System.out.println("Hatalı seçim");
                }

            }
        }

    }
}