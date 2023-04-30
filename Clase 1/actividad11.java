/* 
Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor
que 10.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class actividad11 {

    public static void main(String[] args) {

        int numero1;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero");
            numero1 = Integer.valueOf(entrada.readLine());

            //a
            System.out.println("¿Numero1 es multiplo de 6 y 7? " + (numero1 % 6==0 && numero1 % 7==0));

            //b
            System.out.println("¿Numero1 es mayor a 30? " + (numero1 > 30 && numero1 % 2==0 || numero1 <= 30));

            //c
            System.out.println();



            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
    
}
