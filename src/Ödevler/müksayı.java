package Ödevler;
import java.util.*;
public class müksayı {
    public static void main(String[] args) {
        int n, deger = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        n = input.nextInt();

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                deger = deger + i;
            }
        }

        if (deger == n) {
            System.out.println(n + " Mükemmel sayıdır.");
        } else {
            System.out.println(n + " Mükemmel sayı değildir.");
        }

    }
}