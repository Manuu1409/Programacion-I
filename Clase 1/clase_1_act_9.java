/*
Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no.
 */

 import java.io.BufferedReader; 
 import java.io.InputStreamReader;

public class clase_1_act_9 {
    
    public static void main(String[] args) {

        int numero1;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero y se te dara el cociente de 2 , 3 y 4");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.print("Cociente de 2 -> " + (numero1 % 2) + ",de 3 -> " + (numero1 % 3) + " y de 4 -> " + (numero1 % 4));

            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }
    
}
