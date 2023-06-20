/*
Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y elimine la primera ocurrencia de número en la matriz (un
número igual) si existe. Para ello tendrá que buscar la posición y si
está, realizar un corrimiento a izquierda y no continuar buscando.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad5 {

    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {

        int [][] matint = new int[MAXFILA][MAXCOLUMNA];

        System.out.println("Matriz Aleatoria");
        cargar_matriz_aleatorio_int(matint);
        imprimir_matriz_int(matint);

        int num = obtener_numero_usuario(matint);
        eliminar_primer_ocurrencia(matint, num);

        System.out.println("Matriz al encontrar y eliminar la primer ocurrencia puesta por el usuario");
        imprimir_matriz_int(matint);

    }

    public static int obtener_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {

            System.out.println("Ingrese el numero a borrar (se borra solo el primero puesto)");
            numero = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero;
    }

    public static void corrimiento_izquierda(int[] arr, int pos) {
        for (int i = pos; i < MAXCOLUMNA - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void eliminar_primer_ocurrencia(int[][] mat, int numero) {
        int fila = 0;
        int columna = 0;
        boolean primerocurrencia = false;
        while (fila < MAXFILA && !primerocurrencia) {
            while (columna < MAXCOLUMNA && !primerocurrencia) {
                if (mat[fila][columna] == numero) {
                    corrimiento_izquierda(mat[fila], columna);
                    primerocurrencia = true;
                }
                columna++;
            }
            fila++;
        }
    }

/*
    public static void eliminar_primer_ocurrencia(int[][] mat, int numero) {

        for (int fila = 0; fila < MAXFILA; fila++) {
            for (int columna = 0; columna < MAXCOLUMNA; columna++) {
                if (mat[fila][columna] == numero) {
                    corrimiento_izquierda(mat[fila], columna);
                    break;
                }
            }
        }
    }
*/
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