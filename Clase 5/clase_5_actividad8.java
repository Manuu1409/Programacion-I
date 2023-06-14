/*
Implementar un método que realice un corrimiento a izquierda en
un arreglo ordenado de tamaño MAX=10 a partir de una posición.
*/



public class clase_5_actividad8 {

    public static final int MAX = 10;

    public static void main(String[] args) {

        int arrenteros [] = {0,1,2,3,4,5,6,7,8,9};
        int pos = 2;

        System.out.println("Arreglo ordenado");
        imprimir_arreglo_int(arrenteros);

        corrimiento_izquierda(arrenteros, pos);
        System.out.println("Corrimiento izquierda por POS definido");
        imprimir_arreglo_int(arrenteros);
        
    }

    public static void corrimiento_izquierda(int []arr, int pos) {
        for(int i = pos ;i < MAX-1 ; i++) {
            arr[i] = arr[i+1];

        }
     }

    public static void imprimir_arreglo_int(int[] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arr[pos]);
        }
    }

    
    
}

//ESTE ES POR INGRESO DEL USUARIO Y UN METODO DE ORDENAMIENTO
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_5_actividad8 {

    public static final int MAX = 10;
    public static final int MAX_VALOR = 10;
    public static final int MIN_VALOR =1;
    
    public static void main(String[] args) {
        
        int arrenteros []= new int [MAX];

        cargar_arreglo_aleatorio_int(arrenteros);
        burbujeo(arrenteros);
        imprimir_arreglo_int(arrenteros);
        int num = obtener_numero_usuario(arrenteros);
        corrimiento_izquierda(arrenteros, num);
        imprimir_arreglo_int(arrenteros);


    }

    public static void burbujeo (int []arr){
        int tmp;
        for(int i = 1; i < MAX; i++){
            for(int j = 0; j < MAX-1; j++){
                if (arr[j] > arr[j+1]){
                tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
         }
       }
     }

     public static void corrimiento_izquierda(int []arr, int pos) {
        for(int i = pos ;i < MAX-1 ; i++) {
            arr[i] = arr[i+1];

        }
     }

     public static int obtener_numero_usuario (int []arr) {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    int numero = 0;

    try {

        System.out.println("Ingrese una pos del arreglo para corrimiento izquierda");
        numero = Integer.valueOf(entrada.readLine());
        
    } catch (Exception exc) {
        System.out.println(exc);
    }

    return numero;
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
*/