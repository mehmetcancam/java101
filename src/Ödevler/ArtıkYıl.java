package Ödevler;
import java.util.*;
public class ArtıkYıl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yıl;

        System.out.print("Dogum Yilinizi Giriniz: ");
        yıl = input.nextInt();

        if( yıl % 100 == 0 ){
            if (yıl % 400 == 0){
                System.out.print(yıl + " bir artik yildir.");
            }else {
                System.out.print(yıl + " bir artik yil degildir.");
            }
        }else if (yıl % 4 == 0){
            System.out.print(yıl + " bir artik yildir.");
        }else
            System.out.print(yıl + " bir artik yil degildir.");
    }
}
