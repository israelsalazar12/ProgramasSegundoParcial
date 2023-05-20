/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaria;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP pro
 */
public class Binaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 6, 8, 9, 13, 16};
        int posicion;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el número para buscar");
        int num = leer.nextInt();

        Arrays.sort(arreglo);

        posicion = Arrays.binarySearch(arreglo, num);
        System.out.println("numero ncontrado en la posicion: " + (posicion + 1));
    }

}
