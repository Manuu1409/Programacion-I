/*
Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y luego inserte el
número en la matriz en la fila indicada manteniendo su orden.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad7 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    
    public static void main(String[] args) {
        
        int [][] matint = new int[MAXFILA][MAXCOLUMNA];

        System.out.println("Matriz Ordenada");
        cargar_matriz_aleatorio_int(matint);
        burbujeo_mat(matint);
        imprimir_matriz_int(matint);

        int num = obtener_numero_usuario(matint);
        int fila = obtener_fila_usuario(matint);

        insertar_numero(matint, num, fila);
        burbujeo_mat(matint);

        System.out.println("Numero y fila ingresado y ademas ordenado");
        imprimir_matriz_int(matint);

    }

    public static void burbujeo_mat (int [][] mat) {
        for (int fila = 0; fila < MAXFILA;fila++){
            burbujeo_arr(mat[fila]);
        }
    }
    
    public static void burbujeo_arr(int [] arr){
        int tmp;
        for(int i = 1; i < MAXCOLUMNA; i++){
            for (int j = 0; j < MAXCOLUMNA - 1; j++){
                if(arr[j] > arr[j+1]){
                tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                }
            }
        }
    }

    public static void insertar_numero(int[][] mat, int numero, int fila) {

        int pos = 0;

        if (fila >= 0 && fila < MAXFILA) {
            int[] arr = mat[fila];

            while (pos < MAXCOLUMNA && arr[pos] < numero) {
                pos++;
            }

            corrimiento_derecha(arr, pos);

            arr[pos] = numero;
        } else {
            System.out.println("La fila que pusiste no existe");
        }
    }

    public static int obtener_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {

            System.out.println("Ingrese el numero a poner en la matriz");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero;
    }

    public static int obtener_fila_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int fila = 0;

        try {

            System.out.println("Ingrese la fila donde se pondra el numero");
            fila = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return fila;
    }

    public static void corrimiento_derecha (int [] arr, int pos) {
    for (int i = MAXCOLUMNA-1; pos <= i ;i--) {
        arr[i] = arr[i-1];
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
