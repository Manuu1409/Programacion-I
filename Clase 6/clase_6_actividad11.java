/*
Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor.
*/

import java.util.Random;

public class clase_6_actividad11 {

    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 9;
    public static final double probabilidad_espacio = 0.4;

    public static void main(String[] args) {
        
        int[][] matint = new int[MAXFILA][MAXCOLUMNA];

        cargar_matriz_aleatorio_secuencias_int(matint);
        imprimir_matriz_int(matint);
        buscar_inicio_mayor_mat(matint);
    }

    public static void buscar_inicio_mayor_mat (int [][] mat) {  //recorre las filas
        for (int fila =0; fila < MAXFILA; fila++) {
            buscar_inicio_mayor_arr(mat[fila]);
        }
    }


    public static void buscar_inicio_mayor_arr (int [] arr) {
        int inicio = 0, fin = -1, suma = 0, sumaMayor = 0, inicioMayor = 0, finMayor = 0;

        while (inicio < MAXCOLUMNA) {
            inicio = obtener_inicio_secuencias(arr, fin +1);

            if(inicio < MAXCOLUMNA) {
                fin = obtener_fin_secuencias(arr, inicio);
                suma = sumatoria_secuencias(arr, inicio, fin);
                if(suma > sumaMayor) {
                    sumaMayor = suma;
                    inicioMayor = inicio;
                    finMayor = fin;
                }

            }
        }
        System.out.println("la secuencia con mayor sumatoria es: " + inicioMayor + " y finaliza en: " + finMayor);
    }

    public static int sumatoria_secuencias(int[] arr, int inicio, int fin) {
        int suma = 0;

        for (int i = inicio; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static int obtener_inicio_secuencias(int []arr, int pos){
    while((pos<MAXCOLUMNA)&&(arr[pos]==0)){
        pos++;
    }
    return pos;
}

public static int obtener_fin_secuencias(int []arr, int pos){
    while((pos<MAXCOLUMNA)&&(arr[pos]!=0)){
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
