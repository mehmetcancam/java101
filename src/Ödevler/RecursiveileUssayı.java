package Ödevler;
import java.util.*;
public class RecursiveileUssayı {
    static int power(int base, int exp){
            if (exp==0){
                return 1;
            }
        return power(base,exp-1)*base;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, exp;
        System.out.print("Tabani Giriniz: ");
        base =input.nextInt();
        System.out.print("Ussu Giriniz: ");
        exp=input.nextInt();
        System.out.println(power(base,exp));


    }
}
