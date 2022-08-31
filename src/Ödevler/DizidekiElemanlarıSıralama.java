package Ödevler;
import java.util.Arrays;
import java.util.*;
public class DizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =0;
        int sayı = 0;

        System.out.print("Dizinin Boyutunu Giriniz: ");
        n = input.nextInt();
        if (n <= 0){
            System.out.println("Hatali Sayi Girdiniz!!");
        }else {
            int [] list = new int[n];
            for (int i = 0; i<n;i++){
                System.out.print(i+". Elemani: ");
                sayı = input.nextInt();
                list[i]=sayı;
            }
            Arrays.sort(list);
            System.out.println(Arrays.toString(list));}



    }
}
