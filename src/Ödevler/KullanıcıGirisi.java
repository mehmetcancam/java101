package Ödevler;

import java.util.Scanner;

public class KullanıcıGirisi {
    public KullanıcıGirisi() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adi Giriniz: ");
        String ıd = input.nextLine();
        System.out.print("Sifre Giriniz: ");
        String sifre = input.nextLine();
        if (ıd.equals("mehmetcan") && sifre.equals("12345")) {
            System.out.print("Giris Basarili");
        } else {
            System.out.println("Hatali Giris Yaptiniz");
            System.out.print("Yeni sifre girin: ");
            String yenisifre = input.nextLine();
            System.out.print("Kullanici Adi Giriniz: ");
            ıd = input.nextLine();
            System.out.print("Sifre Giriniz: ");
            String a = input.nextLine();
            if (ıd.equals("mehmetcan") && yenisifre.equals(a)) {
                System.out.print("Giris Basarili");
            }
        }

    }
}