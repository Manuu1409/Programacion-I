/*
Hacer un programa que invierta el orden de la última secuencia
en un arreglo.
*/

import java.util.Random;

public class clase_5_actividad23 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        
        int arrenteros [] = new int[MAX];

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        System.out.println("Invierto el orden de la ultima secuencia");
        int fin = obtener_pos_fin(arrenteros, MAX-1);
        int inicio = obtener_pos_ini(arrenteros, fin);
        Invertir_orden_ultima_secuencia(arrenteros,inicio, fin);
        imprimir_arreglo_secuencias_int(arrenteros);
        


    }

    public static void Invertir_orden_ultima_secuencia (int [] arr, int inicio, int fin) {

        while(inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }

    }



    public static int obtener_pos_ini(int[] arr, int pos) {
        while (pos > 0 && arr[pos] != 0) {
            pos--;
        }
        return pos + 1;
    }

    public static int obtener_pos_fin(int[] arr, int pos) {
        while (pos > 0 && arr[pos] == 0) {
            pos--;
        }
        return pos;
    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
        if (r.nextDouble()>probabilidad_numero){
        arr[pos]=(r.nextInt(MAX_VALOR-MIN_VALOR+1) + MIN_VALOR);
        }
        else{
        arr[pos]=0;
        }
      }
    }

    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
        System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }

    
}
