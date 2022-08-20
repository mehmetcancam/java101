package Ödevler;
import java.util.*;

public class basamaksayısıtoplam {
    public static void main(String[] args) {

        Scanner i =new Scanner(System.in);
        System.out.println("Sayı:");
        int s=i.nextInt();
        int a=0;

        while(s!=0){
            a+=s%10;
            s/=10;
        }
        System.out.println(a);


    }
}
