/*
Se tiene una matriz de enteros de tamaño 4*20 de secuencias de
números entre 1 y 9 (por cada fila), separadas por 0. La matriz
está precargada, y además cada fila empieza y termina con uno o
más separadores 0. Además, se tiene una matriz de caracteres de
tamaño 4*20 de secuencias de caracteres letras minúsculas entre
‘a’ y ‘z’ (por cada fila), separadas por ‘ ’ (espacios). La matriz está
precargada, y además cada fila empieza y termina con uno o más
separadores ‘ ’. Considere para los siguientes ejercicios estos dos
tipos de matriz.
10. Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, permita obtener a través de
métodos la posición de inicio y la posición de fin de la secuencia
ubicada a partir de una posición entera y una fila, ambas
ingresadas por el usuario. Finalmente, si existen imprima por
pantalla ambas posiciones obtenidas.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_6_actividad10 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
    public static final double probabilidad_espacio = 0.4;

    public static void main(String[] args) {
        
        int[][] matint = new int[MAXFILA][MAXCOLUMNA];

        cargar_matriz_aleatorio_secuencias_int(matint);
        imprimir_matriz_int(matint);

        int posicion = obtener_numero_usuario(matint);
        int fila = obtener_fila_usuario(matint);

        int inicio = obtener_inicio_secuencias(matint[fila], posicion);
        int fin = obtener_fin_secuencias(matint[fila], posicion);
        
        System.out.println("El inicio de la secuencia esta en " + inicio + " y el fin esta en " + fin );
        imprimir_matriz_int(matint);
        

        
    }

    public static int obtener_numero_usuario (int [][]mat) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {

            System.out.println("Ingrese una pos en la matriz, despues se te preguntara la fila y te dire el inicio y fin de la secuencia");
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

    public static int obtener_inicio_secuencias(int[] arr, int pos) {
    if (arr[pos] == 0) {
        while (arr[pos] == 0 && pos < MAXCOLUMNA) {
            pos++;
        }
    } else {
        while (arr[pos] != 0 && pos < MAXCOLUMNA) {
            pos--;
        }
        pos++;
    }
    return pos;
}

    public static int obtener_fin_secuencias(int[] arr, int pos) {
        while (arr[pos] != 0 && pos < MAXCOLUMNA) {
            pos++;
        }
        return pos - 1;
    }


    public static void cargar_arreglo_aleatorio_int(int [] arr) {
        Random r = new Random();

        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            if (r.nextDouble()>probabilidad_espacio)
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }


    public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
        for (int fila = 0; fila < MAXFILA; fila++){
            cargar_arreglo_aleatorio_int(mat[fila]);
        }
        System.out.println("");
    }

     public static void imprimir_arreglo_int(int [] arr) {
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }

    public static void imprimir_matriz_int(int [][] mat){
        for (int fila = 0; fila < MAXFILA; fila++){
            imprimir_arreglo_int(mat[fila]);
            System.out.println("");
        }
    }
}
