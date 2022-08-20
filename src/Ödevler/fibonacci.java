package Ödevler;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int n,a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayisi: ");
        n = input.nextInt();
        a = 0;
        b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i < n; i++){
            c = b + a;
            a = b;
            b = c;
            System.out.print(" " + c);
        }


    }
}
