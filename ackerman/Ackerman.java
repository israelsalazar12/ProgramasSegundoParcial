
package ackerman;

import static ackerman.acker.Ackerman;
import static ackerman.acker.leer;
import java.util.Scanner;


public class Ackerman {
   

 
    public static void main(String[] args) {
        // TODO code application logic here
       int m,n;
       
        System.out.print("Favor de ingresar el primer valor:");
        m=leer.nextInt();
        System.out.print("Favor de ingresar el segundo valor:");
        n=leer.nextInt();
         System.out.print("El valor Ackerman es:"+Ackerman(m,n));;
        
        
    }
    
}
