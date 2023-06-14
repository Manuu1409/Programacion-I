/*
Hacer un programa que dado un arreglo de caracteres de tamaño
10 que se encuentra cargado, invierta el orden del contenido. Este
intercambio no se debe realizar de manera explícita, hay que
hacer un método que incluya una iteración de intercambio.
*/

public class clase_5_actividad5 {
    public static int MAX = 10;

    public static void main(String[] args) {

        char arrenteros [] = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5'};

        System.out.println("Arreglo default");
        imprimir_arreglo_int(arrenteros);
        
        System.out.println("Arreglo invertido");
        invertirArr(arrenteros);
        imprimir_arreglo_int(arrenteros);
        
    }

    public static void invertirArr (char [] arr) {
        char aux;
		for(int pos=0; pos<MAX/2; pos++){
			aux = arr[pos];
			arr[pos] = arr[MAX-1-pos];
			arr[MAX-1-pos] = aux;
		}
	
    }

    public static void imprimir_arreglo_int(char[] arr){
        for (int pos = 0; pos < MAX; pos++){
        System.out.println("arrenteros["+pos+"] -> "+arr[pos]);
        }
    }
    
}
