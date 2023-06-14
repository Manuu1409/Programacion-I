/*
Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número).
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_5_actividad11 {

    public static final int MAX= 10;
    public static final int MAX_VALOR= 10;
    public static final int MIN_VALOR= 1;
    
    public static void main(String[] args) {

        int arrenteros [] = new int [MAX];

        System.out.println("Arreglo aleatorio");
        cargar_arreglo_aleatorio_int(arrenteros);
        imprimir_arreglo_int(arrenteros);

        int num = obtener_numero_usuario();
        eliminar_todas_ocurrencias(arrenteros, num);
         if (arrenteros[9] == num) {
            arrenteros[9] = 0;
        }
        System.out.println("Asi quedaria el arreglo eliminando todas las ocurrencias");
        imprimir_arreglo_int(arrenteros);

        

    }

    public static void eliminar_todas_ocurrencias (int [] arr, int numero)  {


        for(int pos = 0; pos < MAX; pos++) {
            if (numero == arr[pos]) {
                corr_izq_usuario(arr, pos);
            }
        }
    }

    public static int obtener_numero_usuario() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;

        try {
            System.out.println("Ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero;
    }

    public static void corr_izq_usuario(int [] arr, int pos){
         for (int i = pos; i < MAX - 1; i++) {
        arr[i] = arr[i + 1];

    }
}

    public static void imprimir_arreglo_int(int[] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arr[pos]);
        }
    }

    public static void cargar_arreglo_aleatorio_int(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
        arr[pos]=(r.nextInt(MAX_VALOR-MIN_VALOR+1) + MIN_VALOR);
        }
    }
}
