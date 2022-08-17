package Ödevler;
import java.util.Scanner;
public class burcunubul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun, ay;

        System.out.print("Dogdugunuz gunu yaziniz: ");
        gun = input.nextInt();

        System.out.print("Kacinci ayda dogdunuz: ");
        ay = input.nextInt();

        if ((ay > 12 || gun > 31)){
            System.out.print("Yanlis sayi girdiniz");
        }

        if (ay == 3){
            if (gun >= 21){
                System.out.print("Burcunuz Koc");
            }else {
                System.out.print("Burcunuz Balik");
            }
        }else if (ay == 4){
            if (gun >= 21){
                System.out.print("Burcunuz Boga");
            }else {
                System.out.print("Burcunuz Koc");
            }
        }else if (ay == 5) {
            if (gun >= 22) {
                System.out.print("Burcunuz Ikizler");
            } else {
                System.out.print("Burcunuz Boga");
            }
        }else if (ay == 6) {
            if (gun >= 23) {
                System.out.print("Burcunuz Yengec");
            } else {
                System.out.print("Burcunuz Ikizler");
            }
        }else if (ay == 7) {
            if (gun >= 23) {
                System.out.print("Burcunuz Aslan");
            } else {
                System.out.print("Burcunuz Yengec");
            }

        }else if (ay == 8) {
            if (gun >= 23) {
                System.out.print("Burcunuz Basak");
            } else {
                System.out.print("Burcunuz Aslan");
            }

        } else if (ay == 9) {
            if (gun >= 23) {
                System.out.print("Burcunuz Terazi");
            } else {
                System.out.print("Burcunuz Basak");
            }

        }  else if (ay == 10) {
            if (gun >= 23) {
                System.out.print("Burcunuz Akrep");
            } else {
                System.out.print("Burcunuz Terazi");
            }
        }else if (ay == 11) {
            if (gun >= 22) {
                System.out.print("Burcunuz Yay");
            } else {
                System.out.print("Burcunuz Akrep");
            }
        }else if (ay == 12) {
            if (gun >= 22) {
                System.out.print("Burcunuz Oglak");
            } else {
                System.out.print("Burcunuz Yay");
            }
        }else if (ay == 1) {
            if (gun >= 22) {
                System.out.print("Burcunuz Kova");
            } else {
                System.out.print("Burcunuz Oglak");
            }
        }else if (ay == 2) {
            if (gun >= 20) {
                System.out.print("Burcunuz Balik");
            } else {
                System.out.print("Burcunuz Kova");
            }
        }


    }
}
