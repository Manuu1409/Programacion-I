/*
Escribir un programa que permita ingresar dos números enteros,
incremente el primero y decremente el segundo, para luego
mostrar por pantalla en ambos casos, el valor original y el
modificado.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class actividad12 {

    public static void main(String[] args) {
        int numero1, numero2;

        try {

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero a incrementar");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese otro numero a decrementar");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Original numero1 ->" + numero1 + " incrementado -> " + ++numero1 + " Original numero2 ->" + numero2 + " decrementado: " + --numero2);
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
