package Exercitiu4;
import java.util.Random;
public class Exercitiu4 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(31);
        System.out.println("a este " + a);
        int b = random.nextInt(31);
        System.out.println("b este " + b);

        if(a == 0) {
            System.out.println("CMMDC este " + b);
        }else if(b == 0) {
            System.out.println("CMMDC este " + a);
        }else if(a < b){
            for(int i = a; i >= 1; i--){
                if(b%i == 0 && a%i == 0){
                    System.out.println("CMMDC este " + i);
                    break;
                }
            }
        }else{
            for(int i = b; i >= 1; i--){
                if(b%i == 0 && a%i == 0){
                    System.out.println("CMMDC este " + i);
                    break;
                }
            }
        }
    }
}
