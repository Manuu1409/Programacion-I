/*
Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.
*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_5_actividad19 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {

        int arrenteros [] = new int [MAX];

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        int numero = obtenerNumero();
        eliminar_secuencia_usuario(arrenteros, numero);
        System.out.println("Secuencia eliminada por el usuario");
        imprimir_arreglo_secuencias_int(arrenteros);
        
    }

    public static void eliminar_secuencia_usuario(int [] arr, int num ) {
        int inicio = 0;
        int fin = 0;
        int tamanio = 0;

        while (inicio < MAX) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            if (inicio < MAX) {
                fin = obtener_fin_secuencias(arr, inicio);
                tamanio = fin - inicio + 1;

                if (num == tamanio) {
                    eliminar_secuencia(arr, inicio, fin);

                }
            }
          }
        }

        public static void eliminar_secuencia(int[] arr, int inicio, int fin) {
            for (int i = inicio; i <= fin; i++) {
                arr[i] = 0;
            }
        }


    public static int obtenerNumero () {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;

        try {
            System.out.println("Ingrese un numero del tamanio a la secuencia a borrar");
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
