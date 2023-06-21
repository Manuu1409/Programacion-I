/*
Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, y un número entero ingresado por
el usuario, elimine de cada fila las secuencias de tamaño igual al
número ingresado.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad13 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
    public static final double probabilidad_espacio = 0.4;


    public static void main(String[] args) {
        
         int[][] matint = new int[MAXFILA][MAXCOLUMNA];

        cargar_matriz_aleatorio_secuencias_int(matint);
        imprimir_matriz_int(matint);

        int num = obtener_numero_usuario(matint);

        eliminar_secuencia_tamanio_usuario_mat(matint,num);
        System.out.println("Secuencia de tamanio " + num + " eliminadas");
        imprimir_matriz_int(matint);



    }

    public static void eliminar_secuencia_tamanio_usuario_mat(int[][] mat, int num) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            eliminar_secuencia_tamanio_usuario_arr(mat[fila], num);
        }
    }

    public static void eliminar_secuencia_tamanio_usuario_arr(int [] arr, int num ) {
        int inicio = 0;
        int fin = 0;
        int tamanio = 0;

        while (inicio < MAXCOLUMNA) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            if (inicio < MAXCOLUMNA) {
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



    public static int obtener_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero1 = 0;

        try {

            System.out.println("Ingrese el tamanio de la secuencia a eliminar (se hace en todas las filas)");
            numero1 = Integer.valueOf(entrada.readLine());

        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero1;
    }




    public static int obtener_inicio_secuencias(int[] arr, int pos) {
        while ((pos < MAXCOLUMNA) && (arr[pos] == 0)) {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin_secuencias(int[] arr, int pos) {
        while ((pos < MAXCOLUMNA) && (arr[pos] != 0)) {
            pos++;
        }
        return pos - 1;
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();

        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            if (r.nextDouble() > probabilidad_espacio)
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void cargar_matriz_aleatorio_secuencias_int(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            cargar_arreglo_aleatorio_int(mat[fila]);
        }
        System.out.println("");
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }

    public static void imprimir_matriz_int(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo_int(mat[fila]);
            System.out.println("");
        }
    }
    
}
