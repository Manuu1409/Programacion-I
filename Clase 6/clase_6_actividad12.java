/*
Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada, permita encontrar por cada fila
la posición de inicio y fin de la anteúltima secuencia (considerar
comenzar a buscarla a partir de la última posición de la fila).
*/

import java.util.Random;

public class clase_6_actividad12 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
    public static final double probabilidad_espacio = 0.4;

    public static void main(String[] args) {

        int[][] matint = new int[MAXFILA][MAXCOLUMNA];

        cargar_matriz_aleatorio_secuencias_int(matint);
        imprimir_matriz_int(matint);

        obtener_ante_ultima_secuencia_mat(matint);
    }

    public static void obtener_ante_ultima_secuencia_mat(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            obtener_ante_ultima_secuencia_arr(mat[fila]);
        }
    }

    public static void obtener_ante_ultima_secuencia_arr(int arr[]) {
        int inicio = 0;
        int fin = 0;
        int anteUltInicio = 0;
        int anteUltFin = 0;
        int ultInicio = 0;
        int ultFin = 0;

        while (inicio < MAXCOLUMNA) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            if (fin < MAXCOLUMNA) {
                fin = obtener_fin_secuencias(arr, inicio);
            }

            if (inicio < MAXCOLUMNA && fin < MAXCOLUMNA) { // límite del arr
                anteUltInicio = ultInicio;
                anteUltFin = ultFin;
                ultInicio = inicio;
                ultFin = fin;
            }
        }
        System.out.println("Anteultima secuencia comienza en pos: " + anteUltInicio + " y termina en pos " + anteUltFin);
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
