package Ödevler;

import java.util.Scanner;

public class HesapMakinesiSwitch {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, select;

    System.out.print("Ilk Degeri Giriniz: ");
    a = input.nextInt();
    System.out.print("Ikinci Degeri Giriniz: ");
    b = input.nextInt();

    System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
    System.out.print("Islemi Seciniz: ");
    select = input.nextInt();


    switch (select){
        case 1:
            int Toplam = a + b;
            System.out.print("Sonuc: "+ Toplam);
            break;
        case 2:
            int Cıkarma = a - b;
            System.out.print("Sonuc: "+ Cıkarma);
            break;
        case 3:
            int Carpma = a * b;
            System.out.print("Sonuc: "+Carpma);
            break;
        case 4:
            int Bolme = a / b;
            System.out.print("Sonuc: "+ Bolme);
        default:
            System.out.print("Hatali Giris Yaptınız");
    }



    }
}
