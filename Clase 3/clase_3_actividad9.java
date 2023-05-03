/*
Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el caracter corresponde a un número;
d. “otro” para los restantes casos de caracteres.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_3_actividad9 {

    public static void main(String[] args) throws IOException {
        int entero = ObtenerNumero();
        if(entero > 0 && entero < 10) {
            realizarOperacion();
            

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
    
}
