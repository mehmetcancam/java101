package Ödevler;
import java.util.*;
public class üslüsayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayı, üs,total=1;
        System.out.print("Sayiyi Giriniz: ");
        sayı = input.nextInt();
        System.out.print("Ussu Giriniz: ");
        üs = input.nextInt();

        for (int i = 1; i <= üs ; i++){
            total *= sayı;
        }
        System.out.print(total);


    }
}
