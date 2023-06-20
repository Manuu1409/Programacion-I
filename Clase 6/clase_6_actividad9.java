/*
Hacer un programa que dada una matriz de enteros de tamaño
4*5 que se encuentra precargada, solicite al usuario el ingreso de
una fila y dos números enteros (columnas de la matriz), y ordene
de forma creciente la matriz en la fila indicada entre las dos
posiciones columnas ingresadas.

FALTA
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad9 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        
        int matint [][] = new int [MAXFILA][MAXCOLUMNA];

        System.out.println("Matriz aleatoriamente");
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);

        int num1 = obtener_primer_numero_usuario(matint);
        int num2 = obtener_segundo_numero_usuario(matint);
        int fila = obtener_fila_usuario(matint);

        insertar_numeros(matint, fila, num1, num2);

        System.out.println("Con los datos puestos se muestra de forma creciente la matriz en la fila indicada");
        burbujeo_arr(matint[fila]);
        imprimir_matriz_int(matint);

    }

    public static void insertar_numeros(int[][] mat, int fila, int num1, int num2) {
    for (int pos = num1; pos <= num2; pos++) {
        mat[fila][pos] = pos -1 -num1;
    }
}

    public static int obtener_primer_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero1 = 0;

        try {

            System.out.println("Ingrese el primer numero");
            numero1 = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero1;
    }

    public static int obtener_segundo_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero2 = 0;

        try {

            System.out.println("Ingrese el numero segundo numero");
            numero2 = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero2;
    }

    public static int obtener_fila_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int fila = 0;

        try {

            System.out.println("Ingrese la fila");
            fila = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return fila;
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
