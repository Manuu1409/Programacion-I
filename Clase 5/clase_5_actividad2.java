/*
Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
*/

public class clase_5_actividad2 {
    
    public static void main(String[] args) {

        int arrenteros [] = {5, 6 ,18 ,2 ,4 ,9 ,7 ,1 ,10, 0};

        int promedio = obtenerPromedioArr(arrenteros);
        System.out.println("El promedio del arreglo es: " + promedio);

    }

    public static int obtenerPromedioArr (int [] arr) {
        int suma = 0;
        final int MAX = 10;
        for (int pos = 0 ; pos < MAX; pos++) {
            suma+= arr[pos];

        }

        return (suma/MAX);

    }
    
}
