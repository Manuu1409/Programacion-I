/*
Implementar un método que realice un corrimiento a derecha en
un arreglo ordenado de tamaño MAX=10 a partir de una posición.
*/

public class clase_5_actividad7 {

    public static final int MAX = 10;

    public static void main(String[] args) {

        int arrenteros [] = {0,1,2,3,4,5,6,7,8,9};
        int pos = 2;

        System.out.println("Arreglo ordenado");
        imprimir_arreglo_int(arrenteros);

        corrimiento_derecha_pos_predefinida(arrenteros, pos);
        System.out.println("Corrimiento derecha por POS definido");
        imprimir_arreglo_int(arrenteros);

    }

    public static void corrimiento_derecha_pos_predefinida (int [] arr, int pos) {
        for (int i = MAX-1; pos <= i ;i--) {
            arr[i] = arr[i-1];
        }
    }

    public static void imprimir_arreglo_int(int[] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arr[pos]);
        }
    }
    
}
