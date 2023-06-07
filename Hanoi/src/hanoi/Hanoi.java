
package hanoi;

import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int x;
        System.out.println("Numero de discos: ");
        x = leer.nextInt();
        Hanoi(x,1,2,3);                                                       
    }

    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1){
           System.out.println("mover disco de " + origen + " a " + destino);
        }else{
           Hanoi(n-1, origen, destino, auxiliar);
           System.out.println("mover disco de "+ origen + " a " + destino);
           Hanoi(n-1, auxiliar, origen, destino);
        }
    }
}
    
    

