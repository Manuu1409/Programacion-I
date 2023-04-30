/*
Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200).
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class clase_3_actividad7 {
    

    public static void main(String[] args) throws IOException {
        

        int numero = ObtenerNumero();
        if (numero != 0) {
           int resultado = Sumatoria(); 
           System.out.println("La sumatoria de los primeros 200 numeros naturales son: " + resultado);
        }
        
        
    }

    public static int ObtenerNumero () {
        int numero = 0;
     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
    try {
        System.out.println("Ingrese un numero distinto de 0");
        numero = Integer.valueOf(entrada.readLine());
       
    } catch (Exception exc) {
        System.out.println(exc);
    }
    return numero;

     
    }

    public static int Sumatoria() {
        int resultado = 0;
        
        for (int i = 1; i <= 200; i++) {
            resultado += i;
        }
        
        return resultado;
    }
    
    
}
