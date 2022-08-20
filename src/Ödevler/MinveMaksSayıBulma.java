package Ödevler;
import java.util.*;
public class MinveMaksSayıBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minV=999999,maxV=0;
        int b;
        System.out.print("Kac Sayi Gireceksiniz: ");
        int sayıGirisi = input.nextInt();

        for (int a=1 ; sayıGirisi>=a; a++){
            System.out.println(a+". Sayiyi Giriniz: ");
            b=input.nextInt();
            if (b>maxV){
                maxV=b;
            }if (b<minV) {
                minV=b;
            }
        }
        System.out.println("En buyuk sayi: "+ maxV);
        System.out.println("En kucuk sayi: "+minV);




    }
}
