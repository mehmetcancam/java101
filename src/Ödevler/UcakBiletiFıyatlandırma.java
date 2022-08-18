package Ödevler;
import java.util.Scanner;
public class UcakBiletiFıyatlandırma {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double yas, tip,fiyat,mesafe;

     System.out.print("Yasinizi Giriniz: ");
     yas = input.nextDouble();
     System.out.print("1-Tek Yon\n2-Gidis Donus\nYolculuk Tipini Seciniz: ");
     tip = input.nextDouble();
     System.out.print("Mesafeyi Giriniz: ");
     mesafe = input.nextDouble();


     if (yas < 0 || mesafe < 0){
         System.out.print("Hatali veri girdiniz.");
     }else if (tip < 0 || tip > 2){
         System.out.print("Hatali veri girdiniz.");
     }else if (yas < 12 && tip == 1){
         fiyat = 0.5 * (0.9 * mesafe );
         System.out.print("Ucretiniz: " +fiyat);
     }else if (yas < 12 && tip == 2){
         fiyat = 0.5 * 0.8 * (0.1 * mesafe)*2;
         System.out.print("Ucretiniz: " +fiyat);
     }else if (yas >= 12 && yas < 24 ){
         if (tip == 1){
             fiyat = 0.9 * (0.1 * mesafe);
             System.out.print("Ucretiniz: " +fiyat);
         }else {fiyat = 0.8 * 0.9 * (0.1 * mesafe)*2;
             System.out.print("Ucretiniz: " +fiyat);
         }
     }else if (yas >= 24 && yas < 65){
         if (tip == 1){
             fiyat = mesafe * 0.1;
             System.out.print("Ucretiniz: " +fiyat);
         }else {fiyat = mesafe * 0.1 * 0.8 * 2;
             System.out.print("Ucretiniz: " +fiyat);

         }
     }else if (yas > 65){
         if (tip == 1){
             fiyat = mesafe * 0.1 * 0.7;
             System.out.print("Ucretiniz: " +fiyat);
         }else {fiyat = mesafe * 0.1 * 0.7 * 0.2 * 2;
             System.out.print("Ucretiniz: " +fiyat);
         }
     }


    }
}
