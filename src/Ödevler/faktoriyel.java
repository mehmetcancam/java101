package Ödevler;
import java.util.*;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total1=1,total2=1, total3=1;
        int girilenSayı1, girilenSayı2;
        System.out.print("1.Sayiyi Giriniz: ");
        girilenSayı1 = input.nextInt();
        System.out.print("2.Sayiyi Giriniz: ");
        girilenSayı2 =input.nextInt();

        for (int i = 1; i<=girilenSayı1; i++){
            total1 *= i;

        }
        for (int a = 1; a<=girilenSayı2; a++) {
            total2 *= a;

        }for (int b=1; b<=girilenSayı1-girilenSayı2; b++){
            total3 *=b;
        }
        total3 = total1 / (total2*total3);


        System.out.print(girilenSayı1+"\'in "+girilenSayı2 +"\'ye kombinasyonu: "+total3);




    }
}
