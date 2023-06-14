/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima.
*/

import java.util.Random;

public class clase_6_actividad2 {

    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;


    public static void main(String[] args) {
        
        int [][] matint = new int [MAXFILA][MAXCOLUMNA];

        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);
        int pares = numeroParesMat(matint);
        System.out.println("La cantidad de numeros pares es de:" + pares);
    }


    public static int numeroParesMat (int [][] mat) {
        int contador = 0;
        for (int fila = 0; fila < MAXFILA;fila++) {
            contador += numeroParesArr(mat[fila]);
            
        }
        return contador;
    }


    public static int numeroParesArr(int[] arr) {
        int contador = 0;

        for (int pos = 0; pos < MAXCOLUMNA; pos++ ) {
            if (arr[pos] % 2==0) {
            contador++;
          }
        }

        return contador;

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
