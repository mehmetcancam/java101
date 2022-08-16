package Ödevler;

import java.util.Scanner;

public class KDVtutarhesaplama {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double fiyat;
        double kdv1 = 0.08;
        double kdv2 = 0.18;
        System.out.print("Fiyati Giriniz: ");
        fiyat = input.nextInt();
        double toplamkdv = (fiyat > 1000) ? fiyat*kdv1 : fiyat*kdv2;
        System.out.println("Tutar : " + fiyat);
        System.out.println("Kdvsiz Tutar : " + (fiyat-toplamkdv));
        System.out.println("Toplam Kdv : " + toplamkdv);


    }
}
