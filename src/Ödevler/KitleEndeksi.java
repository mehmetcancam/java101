package Ödevler;

import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a, b;
    double c;
    System.out.print("Boyunuzu Metre Cinsinden Giriniz: ");
    a = input.nextDouble();

    System.out.print("Kilonuzu Kg Cinsinden Giriniz: ");
    b = input.nextDouble();

    c = b/(a*a);

    System.out.println("Vucut Kitle Endeksiniz: "+c);
    String str = c <=24.99 ? "Kilonuz Ideal" : "Zayiflamaniz Onerilir";
    System.out.print(str);

    }
}
