/*
Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.
*/



public class clase_5_actividad3 {

    public static final int MAX =10;

    public static void main(String[] args) {

        int arrenteros [] = {5, 6 ,18 ,2 ,4 ,9 ,7 ,1 ,10, 0};

        int promedio = obtenerPromedioArr(arrenteros);
        System.out.println("El promedio del arreglo es: " + promedio);

        int cant = Numero_mayor_promedio(arrenteros, promedio);
        System.out.println("La cantidad de numeros mayor al promedio es " + cant);


    }

     public static int obtenerPromedioArr (int [] arr) {
        int suma = 0;
        
        for (int pos = 0 ; pos < MAX; pos++) {
            suma+= arr[pos];

        }

        return (suma/MAX);

    }

    public static int Numero_mayor_promedio (int[]arr , int prom) {

        int cantidad = 0;

        for (int pos = 0; pos < MAX; pos++) {
            if(arr[pos] > prom) {
                cantidad++;
            }
        }
        return cantidad;

    }
    
}
