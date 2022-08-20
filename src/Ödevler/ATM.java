package Ödevler;
import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        int right =3;
        int balance =1500;
        int select;

        while (right>0){
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Sifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("mehmetcan")&& password.equals("memoli123456")){
            System.out.println("Bankamıza Hosgeldiniz.");
            System.out.println("İslem Seciniz");
            System.out.print("1-Para Yatırma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cikis Yapma\nSecilen islem: ");
            select = input.nextInt();

                switch (select){
                    case 1:
                        System.out.print("Yatirilacak miktari giriniz: ");
                        int yatırılanPara = input.nextInt();
                        balance = balance + yatırılanPara;
                        System.out.print("Yeni Bakiyeniz: "+ balance);
                        System.out.println("Cikis Yapildi.");
                        break;
                    case 2:
                        System.out.print("Cekilecek miktari giriniz: ");
                        int cekilenPara = input.nextInt();
                        if (cekilenPara > balance){
                            System.out.println("Bakiyenizden Fazla Para Cekemezsiniz.");
                            System.out.println("Cikis Yapildi.");
                        } else balance = balance - cekilenPara;
                            System.out.print("Yeni Bakiyeniz: "+ balance);
                            break;
                    case 3:
                        System.out.println("Bakiyeniz: "+ balance);
                        break;
                    case 4:
                        System.out.println("Cikis Yapiliyor.");
                        break;
                        default:
                        System.out.print("Lutfen 1-4 arası bir rakam giriniz");
                    }
            }else {right--;
                System.out.println("Hatali Giris Yaptiniz.Tekrar Deneyin");
                if (right==0){
                    System.out.print("Hesabiniz Bloke Olmustur");

                }else
                    System.out.println("Kalan Hakkınız "+right);}
        }

    }
}
