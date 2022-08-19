package Ödevler;
import java.util.*;
public class ciftvedortkatları {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı;
        int total = 0;

        do {
            System.out.print("Sayi Giriniz:");
            sayı = input.nextInt();

            if (sayı % 2 == 0 && sayı % 4 ==0){
               total += sayı;
            }

        }while ( sayı % 2 == 0 );

        System.out.print("Toplam :" + total);

    }
}
