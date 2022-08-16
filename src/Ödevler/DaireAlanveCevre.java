package Ödevler;

import java.util.Scanner;
public class DaireAlanveCevre {
    public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    double yaricap, alfa;
    double pi = 3.14;

    System.out.print("Yaricapi Giriniz: ");
    yaricap = input.nextDouble();

    double alan = pi*yaricap*yaricap;
    double cevre = 2 * pi * yaricap;
    System.out.println("Cevre :"+ cevre);
    System.out.println("Alan : " + alan);
    System.out.print("Merkez Aci Olcusunu Girin: ");
    alfa = input.nextDouble();

    double dilimalan = (pi*(yaricap*yaricap)*alfa)/360;
    System.out.print("Daire Dilimi Alani: "+ dilimalan);

    }

}
