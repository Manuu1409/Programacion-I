/*
Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y elimine la primera
ocurrencia de número en la fila indicada (un número igual) si
existe.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad8 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {

        int [][] matint = new int [MAXFILA][MAXCOLUMNA];

        System.out.println("Matriz ordenada crecientemente");
        cargar_matriz_aleatorio_int(matint);
        burbujeo_mat(matint);
        imprimir_matriz_int(matint);

        int num = obtener_numero_usuario(matint);
        int fila = obtener_fila_usuario(matint);

        eliminar_primer_ocurrencia_arr(matint[fila], num);

        System.out.println("Eliminacion del numero puesto en la fila " + fila);
        imprimir_matriz_int(matint);
        
    }


    public static void eliminar_primer_ocurrencia_arr (int [] arr, int numero)  {
        
        for(int pos = 0; pos < MAXCOLUMNA; pos++) {
            if (numero == arr[pos]) {
                corrimiento_izquierda(arr, pos);
                break;
            }
        }
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

    public static int obtener_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {

            System.out.println("Ingrese el numero a eliminar , despues se te preguntara en que fila");
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

            System.out.println("Ingrese la fila");
            fila = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return fila;
    }

    public static void corrimiento_izquierda(int[] arr, int pos) {
        for (int i = pos; i < MAXCOLUMNA - 1; i++) {
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
