package Ödevler;

import java.util.Scanner;
public class Dikucgenhipovealan {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        double a, b, c,alan,d;
        System.out.print("Kenar Uzunlugunu Giriniz: ");
        a = input.nextDouble();
        System.out.print("Kenar Uzunlugunu Giriniz: ");
        b = input.nextDouble();
        d= (a*a)+(b*b);
        c = Math.sqrt(d);
        System.out.println("Ucgenin Hipotenusu: "+ c);
        alan = (a*b)/2;
        System.out.print("Ucgenin Alani: "+ alan);
    }
}
