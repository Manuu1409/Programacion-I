/*
Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina?
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_2_act_10 {

    public static void main(String[] args) {
        int numero, suma=0;
        boolean EsValido = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(EsValido) {
            try {
                System.out.println("Ingrese un numero entre 1 y 10 inclusive");
                numero = Integer.valueOf(entrada.readLine());

                if (numero < 1 || numero > 10) {
                    EsValido = false;
                }
                else {
                    suma = suma + numero;
                }
                
            } catch (Exception e) {
                System.out.println("Error en el while");
            }
        }

            System.out.println("La suma de los numeros es: " + suma);
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        


    }
    
}
