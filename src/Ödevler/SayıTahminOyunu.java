package Ödevler;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class SayıTahminOyunu {
    public static void main(String[] args) {

        double number =(int) (Math.random()*100);

        Scanner input = new Scanner(System.in);


        int right = 0;




        while (right<5){
            System.out.print("Tahimininizi Giriniz: ");
            int selected= input.nextInt();
            if (selected < 0 || selected>99){
                System.out.println("Lütfen 0-100 Arasinda Değer Giriniz!");
                continue;
            }
            if (selected==number){
                System.out.println("Bildiniz!!!!");
                break;
            }else {


                System.out.println("Hatali Sayi Girdiniz.");
                if (selected < number){
                    System.out.println(selected + " sayisi gizli sayidan kucuktur");
                }else {
                    System.out.println(selected + " sayisi gizli sayidan buyuktur");
                }

                right++;
                System.out.println("Kalan Hakkiniz: "+ (5-right));
                if(right==5)
                    System.out.println("Gizli Sayi: "+ number);
            }


        }

    }
}
