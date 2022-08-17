package Ödevler;
import java.util.Scanner;
public class kucuktenbuyugesıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Ilk sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("Ikinici sayiyi giriniz: ");
        b = input.nextInt();
        System.out.print("Ucuncu sayiyi giriniz:");
        c = input.nextInt();

        if (a < b && b < c){
            System.out.print(a+"<"+b+"<"+c);

        }else if (a < c && c < b){
            System.out.print(a+"<"+c+"<"+b);

        }else if (b < a && a < c){
            System.out.print(b+"<"+a+"<"+c);

        }else if (b < c && c < a){
            System.out.print(b+"<"+c+"<"+a);

        }else if (c < a && a < b){
            System.out.print(c+"<"+a+"<"+b);

        }else if (c < b && b < a){
            System.out.print(c+"<"+b+"<"+a);
        }
    }

}
