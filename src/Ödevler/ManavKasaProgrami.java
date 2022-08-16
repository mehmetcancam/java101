package Ödevler;

import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double armut, elma, domates, muz, patlıcan, armutkg = 2.14, elmakg= 3.67, domateskg = 1.11, muzkg = 0.95, patlıcankg = 5.0, toplam;

    System.out.print("Kac Kg Armut Aldiniz ? :");
    armut = input.nextDouble();

    System.out.print("Kac Kg Elma Aldiniz ? :");
    elma =input.nextDouble();

    System.out.print("Kac Kg Domates Aldiniz ? :");
    domates = input.nextDouble();

    System.out.print("Kac Kg Muz Aldiniz ? :");
    muz = input.nextInt();

    System.out.print("Kac Kg Patlican Aldiniz ? :");
    patlıcan = input.nextDouble();

    toplam = armut+elma+domates+muz+patlıcan;

    System.out.print("Borcunuz : "+ toplam);

    }
}
