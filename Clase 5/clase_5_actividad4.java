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




//ESTE ES PARA INGRESO DEL USUARIO

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_5_actividad4 {

    public static final int MAX = 10;
    
    public static void main(String[] args) throws IOException {
        
        char arrenteros [] = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5'};

        char caracter = ObtenerCaracter();
        buscarElementoArr(arrenteros, caracter);
        

        
    }

    public static void buscarElementoArr (char [] arr, char buscar) {
        //char buscar = 'c' ;
        

        for (int pos = 0; pos < MAX; pos++) {
        if (arr [pos] == buscar) {
            System.out.println("El elemento buscado esta en pos " + pos);
            

        }
    }
}

    public static char ObtenerCaracter () throws IOException {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    char caracter = ' ';

    try {

        System.out.println("Ingrese un valor que tenga el arreglo y te dire en que pos se encuentra");
        caracter = entrada.readLine().charAt(0);
        
    } catch (Exception exc) {
        System.out.println(exc);
    }

    return caracter;
}
}
*/