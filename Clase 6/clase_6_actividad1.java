/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio.
*/

import java.util.Random;

public class clase_6_actividad1 {

    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        
        int [][] matint = new int [MAXFILA][MAXCOLUMNA];

        System.out.println("Matriz Default");
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);

        System.out.println("Matriz invertida por fila");
        invertirMatriz(matint);
        imprimir_matriz_int(matint);

    }


    public static void invertirMatriz(int [][] mat) {
        for (int fila = 0; fila < MAXFILA;fila++){
            invertirArr(mat[fila]);
        }
    }

    public static void invertirArr (int [] arr) {
    int aux;
    for(int pos=0; pos<MAXCOLUMNA/2; pos++){
        aux = arr[pos];
        arr[pos] = arr[MAXCOLUMNA-1-pos];
        arr[MAXCOLUMNA-1-pos] = aux;
    }

}

	    public static void cargar_matriz_aleatorio_int (int [][] mat) {
	    Random r = new Random();
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            cargar_arreglo_aleatorio_int(mat[fila]);
	        }
	    }

	    public static void cargar_arreglo_aleatorio_int(int [] arr) {
	        Random r = new Random();
	        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
	            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
	        }
	    }

	    public static void imprimir_matriz_int(int [][] mat) {
	        for (int fila = 0; fila < MAXFILA; fila++) {
	            imprimir_arreglo_int(mat[fila]);
	        }
	    }

	    public static void imprimir_arreglo_int(int [] arr) {
	        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
	            System.out.print("[" + arr[pos] + "]");
	        }
	        System.out.println("");
	    }

    
}
