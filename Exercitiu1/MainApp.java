package Exercitiu1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lungimea = ");
        int lun = scanner.nextInt();

        System.out.print("latimea = ");
        int lat = scanner.nextInt();

        int per = 2 * lun + 2 * lat;
        int arie = lun * lat;

        System.out.println("Perimetrul este: " + per);
        System.out.println("Aria este: " + arie);
        scanner.close();
    }
}
