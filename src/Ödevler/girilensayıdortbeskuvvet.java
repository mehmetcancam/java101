package Ödevler;
import java.util.*;
public class girilensayıdortbeskuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Sayi Giriniz: ");
        a = input.nextInt();

        for ( int i = 1 ; i <= a ; i*=4 ){
            System.out.println("4 un kuvvetleri: "+i);
        }System.out.println("----------------------------------");
        for (int k = 1 ; k <= a; k *=5){
            System.out.println("5 in kuvvetleri: "+k);
        }


    }
}
