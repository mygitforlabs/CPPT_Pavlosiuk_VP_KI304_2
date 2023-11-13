import java.io.*;
import java.util.*;

/*
 * Class Lab1PavlosiukKI304 realize example program to lab work №1
 * @author Vitalii_Pavlosiuk
 * @version 1.0
 * @since version 1.0
 */

public class Lab1PavlosiukKI304 {
    /*
     * Static method main is enter point to program
     * 
     * @param args  
     * @throws FileNotFoundException
     * 
     */
  public static void main(String[] args) throws FileNotFoundException {
        int n;
        char[][] arr;
        String filler;

        Scanner input = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter file = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        n = input.nextInt();
        input.nextLine();
        arr = new char[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = new char[n];
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = input.nextLine();
        input.close();

        if (filler.length() == 0) {
            System.out.print("\nНе введено символ заповнювач");
        } else if (filler.length() == 1) {
            for (int j = 0; j < n; j++) { // raws
                for (int i = 0; i < n; i++) { // columns
                    if (i % 2 != 0) {                       
                            arr[i][j] = (char) filler.codePointAt(0);
                            System.out.print(arr[i][j]);
                            file.print(arr[i][j]);                      
                    } else {
                        System.out.print(" ");
                        file.print(" ");
                    }
                }
                System.out.println();
                file.println();
            }
        } else {
            System.out.print("\nЗабагато символів заповнювачів");
        }

        file.flush();
        file.close();
    }
}