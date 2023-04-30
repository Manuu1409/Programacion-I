/*
Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_2_act_14 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        int numero, pares = 0, contador = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (contador < 10) {
                System.out.println("Ingrese numero entero");
                numero = Integer.valueOf(entrada.readLine());

                if (numero % 2 == 0) {
                    pares++;
                }

                contador++;

            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        System.out.println("Se ingresaron " + pares + " numeros pares");

      



        
    }
    
}
