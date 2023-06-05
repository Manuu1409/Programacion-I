/*
 Se tiene un arreglo de enteros de tamaño 20 de secuencias de
números entre 1 y 9, separadas por 0. El arreglo está precargado,
y además empieza y termina con uno o más separadores 0. Hacer
un programa que permita obtener a través de métodos la posición
de inicio y la posición de fin de la secuencia ubicada a partir de
una posición entera ingresada por el usuario. Finalmente, si
existen imprima por pantalla ambas posiciones obtenidas.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_5_actividad24 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        
        int [] arrenteros = new int [MAX];

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        int num = obtener_numero_usuario(arrenteros);
        obtener_secuencia_por_pos(arrenteros, num);
        imprimir_arreglo_secuencias_int(arrenteros);

    }

    public static void obtener_secuencia_por_pos (int [] arr, int numero) {
        int inicio = 0;
        int fin = 0;

        while (inicio < MAX) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            if (inicio < MAX) {
                fin = obtener_fin_secuencias(arr, inicio);

                if (numero >= inicio && numero < fin) {
                    System.out.println("La pos ingresada por el usuario en inicio esta en " + inicio + " y su fin " + fin + " en la secuencia");

                }
            }
        }
    }

    public static int obtener_numero_usuario (int []arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {

            System.out.println("Ingrese una pos entre 0 y 19 inclusive");
            numero = Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero;
    }


    public static int obtener_inicio_secuencias(int []arr, int pos){
		while((pos<MAX)&&(arr[pos]==0)){
			pos++;
		}
		return pos;
	}

    public static int obtener_fin_secuencias(int []arr, int pos){
		while((pos<MAX)&&(arr[pos]!=0)){
			pos++;
		}
		return pos - 1;
	}


    public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
        if (r.nextDouble()>probabilidad_numero){
        arr[pos]=(r.nextInt(MAX_VALOR-MIN_VALOR+1) + MIN_VALOR);
        }
        else{
        arr[pos]=0;
        }
      }
    }

    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
        System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
    
    
}
