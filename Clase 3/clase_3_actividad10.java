/*
Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter, y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el caracter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el caracter es una letra del
abecedario en mayúscula;
iii. “dígito” si el caracter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_3_actividad10 {

    public static void main (String [] args) throws IOException {

       int entero = ObtenerNumero();
        if (entero % 3==0) {
            realizarOperacion();

        }

        else if (entero % 5==0) {
            TablaMultiplicar(entero);

        }


    }

    public static int ObtenerNumero () {
        int numero = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entre 1 y 10");
            numero = Integer.valueOf(entrada.readLine());
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        return numero;
         
        
    }

    public static char realizarOperacion () throws IOException {
        char letra = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa un caracter");
        letra = entrada.readLine().charAt(0);

        if (letra>='a' && letra<='z') {
            System.out.println("Es letra minuscula");

        }

        else if (letra>='A' && letra<='Z' ) {
            System.out.println("Es letra mayuscula");

        }

        else if (letra>='0' && letra <= '9') {
            System.out.println("Es un digito");

        }

        else {
            System.out.println("Es otro");
        }
        return letra;
    
    }

    public static void TablaMultiplicar (int entero) {
        final int MAX = 10;
        for( int i = 1 ; i <= MAX; i++){
            System.out.println("Tabla de multiplicar de: " + (entero * i));
        }

    }
    
}
