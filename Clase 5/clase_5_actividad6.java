/*
Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.
*/

public class clase_5_actividad6 {
    public static int MAX = 10;

    public static void main(String[] args) {

        int arrenteros [] = {5, 3, 7, 2, 4, 8, 15, 2, 6, 10};

        System.out.println("Arreglo default");
        imprimir_arreglo_int(arrenteros);

        int cantidad = numeroParesArr(arrenteros);
        System.out.println("La cantidad de numeros pares en el arreglo son: " + cantidad);
        
    }

    public static int numeroParesArr(int[] arr) {
        int contador = 0;

        for (int pos = 0; pos < MAX; pos++ ) {
            if (arr[pos] % 2==0) {
            contador++;
          }
        }

        return contador;

    }

    public static void imprimir_arreglo_int(int[] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arr[pos]);
        }
    }

}
