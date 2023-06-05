/*
Hacer un programa que dado el arreglo definido y precargado,
y un número entero ingresado por el usuario, copie de forma
continua las secuencias de tamaño igual al número ingresado en
otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio
del mismo.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase_5_actividad25 {

    public static final int MAX = 20;
    public static final int MAX_VALOR = 9;
    public static final int MIN_VALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {

        int [] arrenteros = new int [MAX];

        int [] arrNuevo = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        int num = obtener_numero_usuario(arrNuevo);
        compararNumeroConLongitudSecuencia(arrenteros, arrNuevo, num);
        imprimir_arregloNuevo(arrNuevo);
        
        
    }

    public static void compararNumeroConLongitudSecuencia(int[] arr, int[] arrNuevo,  int numero) {
        int inicio = 0;
        int fin = 0;
        int j=0;

        while (inicio < MAX) {
            inicio = obtener_inicio_secuencias(arr, fin + 1);
            
            if (inicio < MAX) {
                fin = obtener_fin_secuencias(arr, inicio);
            int longitud = (fin - inicio) + 1;

            if (longitud == numero) {
                for (int i = inicio; i <= fin; i++) {
                    arrNuevo[j] = arr[i];
                    j++;
                }
                
            }
            }
        }
    }

    public static int obtener_numero_usuario (int []arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        try {

            System.out.println("Ingrese el tamaño de una secuencia, 0 y 19 inclusive");
            numero = Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero;
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

    public static void imprimir_arregloNuevo(int[] arrNuevo) {
        System.out.print( "Arreglo de secuencias con las secuencias del otro arreglo con la longitud del numero ingresado x el usuario.\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arrNuevo[pos] + "|");
        }
        System.out.print("\n");
    }
    
}
