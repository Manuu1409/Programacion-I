/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_5_actividad9 {
    
    public static final int MAX= 10;
    public static final int MAX_VALOR= 10;
    public static final int MIN_VALOR= 1;

    public static void main(String[] args) {
        
        int arrenteros [] = new int [MAX];
        
        System.out.println("Arreglo aleatorio");
        cargar_arreglo_aleatorio_int(arrenteros);
        imprimir_arreglo_int(arrenteros);

        agregar_numero_pos_cero(arrenteros);
        corrimiento_derecha(arrenteros);
        System.out.println("Arreglo cambiado por un numero que ingreso el usuario en la posicion 0");
        imprimir_arreglo_int(arrenteros);
    }

    public static void agregar_numero_pos_cero (int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {
            System.out.println("Ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
            arr[0] = numero;

            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }

    public static void corrimiento_derecha(int [] arr){
        for (int i = MAX-1; i > 0; i--){
            arr[i] = arr[i-1];
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
