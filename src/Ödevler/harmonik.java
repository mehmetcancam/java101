package Ödevler;
import java.util.*;
public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisini giriniz: ");
        int n = input.nextInt();
        double result = 0;

        for (double a =1; a<=n; a++){
            result += (1/a);

        }System.out.println(result);

    }
}
