/*
Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número.
 */

 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_2_act_15 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        int numero = 0;
        double promedio = 0;
        int mayor = 0;
        int menor = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresar numeros enteros (0 para salir)");
        numero = Integer.valueOf(entrada.readLine());

        while(numero != 0) {
            try {
                
            } catch (Exception exc) {
                System.out.println(exc);
            }


        }


        
    }
    
}
