package Exercitiu5;
import java.util.Random;
public class Exercitiu5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20);
        int a = 1, b = 1;

        System.out.println("Numarul este " + n);
        while(b + a <= n){
            b += a;
            a ^= b;
            b = a ^ b;
            a ^= b;
        }
        if(n == a)
            System.out.println("Numarul face parte din sirul lui Fibonacci");
        else
            System.out.println("Numarul nu face parte din sirul lui Fibonacci");
    }
}
