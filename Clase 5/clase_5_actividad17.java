/*
Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.
*/

import java.util.Random;

public class clase_5_actividad17 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        
        int arrenteros [] = new int [MAX];

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        obtener_ante_ultima_secuencia(arrenteros);
    }

    public static void obtener_ante_ultima_secuencia(int arr[]) {
        int inicio = 0;
        int fin = 0;
        int anteUltInicio = 0;
        int anteUltFin = 0;
        int ultInicio = 0;
        int ultFin = 0;

        while (inicio < MAX) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            if (fin < MAX) {
                fin = obtener_fin_secuencias(arr, inicio);
            }

            if (inicio < MAX && fin < MAX) { //limite del arr
                anteUltInicio = ultInicio;
                anteUltFin = ultFin;
                ultInicio = inicio;
                ultFin = fin;
            }
        }

        System.out.println("Anteultima secuencia comienza en pos: " + anteUltInicio + " y termina en pos " + anteUltFin);
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


/*
EJEMPLO POR SI NO QUEDO CLARO EL METODO OBTENER_ANTE_ULTIMA_SECUENCIA

Arreglo de secuencias int
|0|4|2|5|0|4|0|5|8|5|0|0|7|7|2|2|6|5|3|0|

1.En el while recorre el inicio que empieza desde 0 hasta MAX que seria 20 que dentro recorre todas las secuencias que siguen despues de ==0
2.Hasta que en el primer if cuando hay un numero !0 corta y va a la siguiente secuencia con el while y asi hasta terminar
Ej 
primer secuencia
empieza en pos 1 y termina en pos 3
segunda secuencia 
empieza en pos 5 y termina en pos 5 , y asi...

3. En el segundo if inicio < MAX && fin < MAX recorre todo el arreglo, si se cumple
anteUltInicio = ultInicio, lo que significa que anteUltInicio tomara el valor de ultInicio. Si hasta ahora ultInicio era igual a 12, entonces anteUltInicio tambien sera igual a 12.
anteUltFin = ultFin, lo que significa que anteUltFin tomara el valor de ultFin. Si hasta ahora ultFin era igual a 17, entonces anteUltFin tambien sera igual a 17.
ultInicio = inicio, lo que significa que ultInicio tomara el valor de inicio. En este caso, ultInicio se actualizara a 12.
ultFin = fin, lo que significa que ultFin tomara el valor de fin. En este caso, ultFin se actualizará a 17.

4.Al finalizar el ciclo while, fuera del if, tendremos los valores de las variables:
anteUltInicio = 12
anteUltFin = 17
ultInicio = 12
ultFin = 17




*/