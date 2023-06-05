/*Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos.
*/

import java.util.Random;

public class clase_5_actividad21 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        
        int arrenteros [] = new int [MAX];

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        System.out.println("Arreglo secuencia aleatorio ");
        imprimir_arreglo_secuencias_int(arrenteros);
        elimar_secuencias_orden_descendente(arrenteros);
        System.out.println("Arreglo secuencia aleatorio elimando las secuencias de orden descendente si hubo ");
        imprimir_arreglo_secuencias_int(arrenteros);


    }

    public static void elimar_secuencias_orden_descendente (int arr[]) {
        int inicio = 0;
        int fin = 0;

        while (inicio < MAX) {
           inicio = obtener_inicio_secuencias(arr, fin + 1);

            if(inicio < MAX) {
               fin = obtener_fin_secuencias(arr, inicio );
               int acum = acumular_cantidad_elementos_descendentes(arr, inicio, fin);
               int longitud = (fin-inicio +1);
               
               if(acum==longitud &&longitud!=1){
                eliminar_secuencia_descendente(arr, inicio, fin);
               }

            fin=inicio;
            }
        }
    }
        
    

    public static int acumular_cantidad_elementos_descendentes(int[]arr, int inicio, int fin){
        int acum=0;
        for(int i=inicio; i<=fin; i++){
            if(arr[i]>arr[i+1]){
                acum++;
            }
        }
        return acum;
    }

    public static void corrimiento_izquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static void eliminar_secuencia_descendente(int[] arr, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            corrimiento_izquierda(arr, inicio);
        }
    }

    public static int obtener_inicio_secuencias(int []arr, int pos){
		while((pos<MAX)&&(arr[pos]==0)){
			pos++;
		}
		return pos;
	}

    public static int obtener_fin_secuencias(int []arr, int pos){
		while((pos<MAX)&&(arr[pos]!=0)){
			pos++;
		}
		return pos - 1;
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