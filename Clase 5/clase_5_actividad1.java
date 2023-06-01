/*
Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_5_actividad1 {
    public static int  MAX = 15;
    
    public static void main(String[] args) {

        int[] arrenteros = new int[MAX];

        obtenerNumeros(arrenteros);
        imprimir_arreglo_int(arrenteros);

    }

    public static void obtenerNumeros(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int pos = 0;
        int numero;
    
        while (pos < MAX) {
            try {
                System.out.println("Ingrese un numero entre 1 y 12 para la posición ");
                 numero = Integer.valueOf(entrada.readLine());
                
                if (numero >= 1 && numero <= 12) {
                    arr[pos] = numero;
                    pos++;
                } else {
                    System.out.println("Numero mal ingresado, intente denuevo");
                }
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
    }
    

    public static void imprimir_arreglo_int(int[] arrenteros){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arrenteros[pos]);
        }
    }


}
