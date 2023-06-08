/*
Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.
*/

//esta actividad la voy a comentar toda por si las dudas
//Seguro esta mal, pero no lo quiero borrar 

import java.util.Random;

public class clase_5_actividad13 {

    //declaro constantes

    public static final int MAX = 10;
    public static final int MAX_VALOR = 10;
    public static final int MIN_VALOR = 1;

    public static void main(String[] args) {

        //creo arreglo int MAX = 10

        int arrenteros [] = new int [MAX];

        //llamo a los metodos en el main , los System es para ubicarme como va yendo la cosa

        cargar_arreglo_aleatorio_int(arrenteros);
        insertarElemento(arrenteros);
        System.out.println("Arreglo aleatorio");
        imprimir_arreglo_int(arrenteros);
  
        burbujeo(arrenteros);
        System.out.println("Arreglo con el insert desordenado");
        imprimir_arreglo_int(arrenteros);

    }

    public static void insertarElemento (int arr[]) {
          int pos = 2;  //posicion que elegi en el arreglo para cambiar
        int num = 4; // numero que voy a cambiar en la posicion
        corrimiento_derecha(arr); //llamo metodo
        arr[pos] = num; // y aca lo implemento... seria arr[2] = 4
        
    }

    public static void burbujeo(int[] arr){
        int temp;
        for(int i = 1;i < MAX;i++){
        for (int j = 0 ; j < MAX - 1; j++){
        if (arr[j] < arr[j+1]){   //ahi esta decreciente , para hacerlo creciente se cambia el signo a >
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
        }
        }
        }

    public static void corrimiento_derecha(int [] arr){
        for (int i = MAX-1; i > 0; i--){
            arr[i] = arr[i-1];
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
