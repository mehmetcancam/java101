package Ödevler;
import java.util.*;
public class GelişmişHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: "+ result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çikarma: "+ result);
        return result;
    }
    static int times(int a,int b){
        int result = a * b;
        System.out.println("Carpma: "+ result);
        return result;
    }
    static int divide(int a, int b){
        if (b==0){
            System.out.println("Ikinci Sayi 0\'dan Buyuk Olmali");
            return 0;
        }
        int result = a/b;
        System.out.println("Bolme: " +result);
        return result;
    }
    static int üs(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }System.out.println("Us: "+ result);
        return result;
    }
    static int mod(int a,int b){
        int result;
        result = a % b;
        System.out.println("Mod: "+ result);
        return result;
    }
    static int alancevre(int a, int b){
        int alan = a*b;
        int cevre = 2*(a+b);
        System.out.println("Alan: "+alan + " Cevre: "+ cevre);
        return alan;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İslemi \n2- Cıkarma İslemi\n3- Carpma İslemi\n4- Bolme İslemi\n5- Uslu Sayi Hesaplama\n6- Mod Alma\n7- Dikdortgen Alan ve Cevre Hesabi\n0- Cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("Bir islem seciniz: ");
            select = input.nextInt();
            if (select==0){
                break;
            }if (select>7){
                System.out.println("0-7 Arasi Bir Deger Giriniz");
                break;
            }
            System.out.print("Ilk Sayiyi Giriniz: ");
            int a = input.nextInt();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    üs(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    alancevre(a, b);
                    break;
                case 0:
                    System.out.println("Cikis Yapiliyor..");
                    break;
                default:

            }
            System.out.println("Gule Gule..");
            break;
        }while (select !=0);


    }
}
