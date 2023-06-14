/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad3 {

    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {

        int [][] matint = new int [MAXFILA][MAXCOLUMNA];

        System.out.println("Matriz Default");
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);

        int fila = obtener_numero_usuario_fila(matint);
        int columna = obtener_numero_usuario_columna(matint);

        corrimiento_izquierda(matint[fila],columna);
        imprimir_matriz_int(matint);

    }



    public static int obtener_numero_usuario_fila (int [][]mat) {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    int fila = 0;

    try {

        System.out.println("Ingrese fila");
        fila = Integer.valueOf(entrada.readLine());
        
    } catch (Exception exc) {
        System.out.println(exc);
    }

    return fila;
}

public static int obtener_numero_usuario_columna (int [][]mat) {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    int columna = 0;

    try {

        System.out.println("Ingrese columna");
        columna = Integer.valueOf(entrada.readLine());
        
    } catch (Exception exc) {
        System.out.println(exc);
    }

    return columna;
}


    public static void corrimiento_izquierda(int[] arr, int pos) {
    for (int i = pos ; i  < MAXCOLUMNA - 1; i++) {
        arr[i] = arr[i + 1];
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
