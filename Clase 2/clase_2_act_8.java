/*
Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_8 {

    public static void main(String[] args) {

    int numero= ' ';
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


while(numero !=0) {
    try {
        System.out.println("Ingrese un numero");
        numero = Integer.valueOf(entrada.readLine());
        System.out.println("El numero ingresado es " + numero);
        
        
    } catch (Exception exc) {
        System.out.println(exc);
   }
    
   }
 }
}
