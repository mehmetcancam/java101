package Ödevler;
import java.util.*;
public class CinZodyagı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumTarihi,burc;
        System.out.print("Dogum Yilinizi Giriniz: ");
        dogumTarihi = input.nextInt();
        burc = dogumTarihi % 12;

        switch (burc){
            case 0:
                System.out.print("Burcunuz Maymun");
                break;
            case 1:
                System.out.print("Burcunuz Horoz");
                break;
            case 2:
                System.out.print("Burcunuz Kopek");
                break;
            case 3:
                System.out.print("Burcunuz Domuz");
                break;
            case 4:
                System.out.print("Burcunuz Fare");
                break;
            case 5:
                System.out.print("Burcunuz Okuz");
                break;
            case 6:
                System.out.print("Burcunuz Kaplan");
                break;
            case 7:
                System.out.print("Burcunuz Tavsan");
                break;
            case 8:
                System.out.print("Burcunuz Ejderha");
                break;
            case 9:
                System.out.print("Burcunuz Yılan");
                break;
            case 10:
                System.out.print("Burcunuz At");
                break;
            case 11:
                System.out.print("Burcunuz Koyun");
                break;
            default:
                System.out.print("Hatali Veri Girdiniz");

        }


    }
}
