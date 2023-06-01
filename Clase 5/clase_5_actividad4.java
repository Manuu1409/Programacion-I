/*
Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.
*/

public class clase_5_actividad4 {
    
    public static void main(String[] args) {
        
        char arrenteros [] = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5'};
        buscarElementoArr(arrenteros);
    }

    public static void buscarElementoArr (char [] arr) {
        char buscar = 'c' ;
        final int MAX = 10;

        for (int pos = 0; pos < MAX; pos++) {
        if (arr [pos] == buscar) {
            System.out.println("El elemento buscado esta en pos " + pos);

        }

        else {
            System.out.println("El elemento buscado no se encuentra en la pos " + pos);
        }
    }


    }
}
