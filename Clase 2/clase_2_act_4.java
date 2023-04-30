/*
Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es.
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_4 {

    public static void main(String[] args) {

        int numero1;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero entre 0 y 999");
            numero1 = Integer.valueOf(entrada.readLine());

            if (numero1 > 0 && numero1 < 999) {
                System.out.println("Correcto");

            }
            else {
                System.out.println("No es un numero entre 0 y 999");
            }
            
            if(numero1 >= 100 && numero1 <=999) {
                System.out.println(numero1 + " tiene 3 digitos");
            }

            
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }


    
}
