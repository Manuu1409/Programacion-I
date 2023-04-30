/*
Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina imprimir por pantalla “terminó”.
*/

public class clase_3_actividad5 {

    public static void main(String[] args) {

      //  int numero = 1;

        incrementar();
        System.out.println("termino");

    }

    public static void incrementar() {
        int numero = 1;
        final int MAX = 4;

        while (numero <= MAX) {
            System.out.println(numero);
            numero++;
        }

    }
    
}
