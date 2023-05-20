/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencial;

import java.util.Scanner;

/**
 *
 * @author HP pro
 */
public class Secuencial {


    public static void main(String[] args) {
        int [] arreglo = {1,2,3,4,5,6,7,8};
        Scanner leer = new Scanner(System.in);
        boolean existe= false;
         
        System.out.println("ingrese el número para buscar");
        int num = leer.nextInt();
         
        for(int i = 0; i < arreglo.length; i++){
             
            if(arreglo[i]==num){
                 
                System.out.println("el numero esta en la posicion "+(i+1));
                break;
            }
            if(i == arreglo.length-1){
                existe = true;
            }
        }       
        if(existe==true){
             
            System.out.println("el numero no esta en el arreglo");
        }
    }
}
    
   
