package Ödevler;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        double mesafe;

        System.out.print("Gidilen Mesafeyi Km Olarak Giriniz: ");
        mesafe = input.nextDouble();

        double a = (mesafe < 4.545454545 ) ? 10 : mesafe*2.20;

        double b = a + 10;

        System.out.print("Ucretiniz: "+ b);

    }
}
