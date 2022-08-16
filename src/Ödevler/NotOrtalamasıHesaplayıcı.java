package Ödevler;

import java.util.Scanner;
public class NotOrtalamasıHesaplayıcı {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int mat, fizik,kimya,muzik,resim;
        System.out.print("Matematik Notunuzu Girin:");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Girin:");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Girin:");
        kimya = input.nextInt();
        System.out.print("Muzik Notunuzu Girin:");
        muzik = input.nextInt();
        System.out.print("Resim Notunuzu Girin:");
        resim = input.nextInt();


        int toplam = mat + fizik + kimya  + muzik + resim;
        double ortalama = toplam / 5 ;
        System.out.println("Ortalamanız : "+ortalama);

        boolean kosul = ortalama >= 60;
        String sonuc = kosul ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(sonuc);

    }
}
