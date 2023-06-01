/*
Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.
*/

import java.util.Random;

public class clase_5_actividad18 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {

        int arrenteros [] = new int [MAX];

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        secuencia_mayor_tamanio(arrenteros);
     
    }

    public static void secuencia_mayor_tamanio(int arr[]) {
        int inicio = 0;
        int fin = 0;
        int inicioMayor = 0;
        int finMayor = 0;
        int tamanioMayor = 0;
       // int tamanio = fin - inicio + 1;
        while (inicio < MAX) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            if (fin < MAX) {
                fin = obtener_fin_secuencias(arr, inicio);
                int tamanio = fin - inicio + 1;
                if (tamanio > tamanioMayor) {
                    tamanioMayor = tamanio;
                    inicioMayor = inicio;
                    finMayor = fin;
                }
            }
        }
        System.out.println("La secuencia con mayor tamanio va desde la posicion " + inicioMayor + " hasta la posicion " + finMayor);
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

