package Exercitiu3;

import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.print("Numarul este:");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            if(n%i == 0){
                count++;
                System.out.println(i);
            }
        }
        if(count == 2){
            System.out.println("Numarul " + n + " este prim");
        }
        scanner.close();
    }
}
