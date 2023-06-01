/*
Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10.
*/

import java.util.Random;

public class clase_5_actividad14 {

    public static int MAX = 10;
    public static final int MAX_VALOR = 10;
    public static final int MIN_VALOR = 1;

    public static void main(String[] args) {
        
        int arrenteros [] = new int [MAX];

        cargar_arreglo_aleatorio_int(arrenteros);
        System.out.println("Arreglo random");
        imprimir_arreglo_int(arrenteros);

        eliminar_valores_pares(arrenteros);
        System.out.println("Arreglo con valores pares eliminados");
        imprimir_arreglo_int(arrenteros);

    }

    public static void eliminar_valores_pares(int[] arr) {
         int pos = 0;
        while (pos < MAX) {
            if (arr[pos] % 2 == 0) {
                corr_izq(arr, pos);
               arr[pos] = MAX--; // achica el arreglo
            } else {
                pos++; // si no es divisible por 2 , avanza otra pos
            }
        }
        /*
        ------ > si no quiero que se achique el arreglo y los numeros pares se me reemplaze por 0 seria: (se reemplaza el codigo)
         for (int i = 0; i < MAX; i++) {
        if (arr[i] % 2 == 0) {
            arr[i] = 0;
        }
    }
    */
    }
    
    public static void corr_izq(int [] arr, int pos){
        while(pos<MAX_VALOR-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }

    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAX_VALOR-MIN_VALOR+1) + MIN_VALOR);
        }
    }

    public static void imprimir_arreglo_int(int[] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arr[pos]);
        }
    }

}




