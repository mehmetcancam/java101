package Ödevler;
import java.util.*;

public class ucevedırdebolenort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n=0;
        double total = 0;

        System.out.print("Sayinizi Giriniz: ");
        i = input.nextInt();

        for (int a=0 ; a <= i; a++){
            if (a % 12 == 0){
                total += a;
                n++;
            }

        }System.out.print("Ortalama: "+ total/n);

    }
}
