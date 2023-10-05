package Exercitiu2;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 1;
        float suma = 0;
        int x;
        Scanner scanner = new Scanner(new File("src/Exercitiu2/in.txt"));
        int min = scanner.nextInt();
        int max = min;
        suma += min;
        while(scanner.hasNext()){
            x = scanner.nextInt();
            count ++;
            suma += x;

            if(min > x){
                min = x;
            }

            if(max < x){
                max = x;
            }

        }
        float medie =suma / count;

        System.out.println("Suma este:" + suma + " Minimul este:" + min + " Maximul este:" + max + " Media este:" + medie);
        PrintStream flux_out = new PrintStream ("out.txt");
        flux_out.print("Suma este:" + suma + " Minimul este:" + min + " Maximul este:" + max + " Media este:" + medie);
    }
}
