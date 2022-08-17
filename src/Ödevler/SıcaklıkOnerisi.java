package Ödevler;
import java.util.Scanner;
public class SıcaklıkOnerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sıcaklık;

        System.out.print("Sicaklik Giriniz: ");
        sıcaklık = input.nextInt();



        if(sıcaklık <= 5){

            System.out.print("Kayaga Gidebilirsiniz");
        }else if(sıcaklık > 5 && sıcaklık <= 15){

            System.out.print("Sinemaya Gidebilirsiniz");

        }else if(sıcaklık > 15 && sıcaklık <= 25){

            System.out.print("Piknige Gidebilirsiniz");

        }else if (sıcaklık > 25){

            System.out.print("Yuzmeye Gidebilirsiniz");
        }

    }
}
