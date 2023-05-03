/*
Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_3_actividad14 {

    public static void main(String[] args) {
        char caracterObtenido = obtenerCaracter();
        if (caracterObtenido != '*' ) {
            resultadoFinal(caracterObtenido);


        }
        
    }

    public static char obtenerCaracter() {
        char caracter = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter distinto de * " );
            caracter = entrada.readLine().charAt(0);
            
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return caracter;
    }


    public static void resultadoFinal (char caracter2) {

        if (caracter2>='a' && caracter2<='z') {
            if(caracter2 == 'a' || caracter2 == 'e' || caracter2 == 'i' || caracter2 == 'o' || caracter2 == 'u' ) {
                System.out.println("Es vocal");

            }
            else {
                System.out.println("Es consonante");
            }

        }

        else if (caracter2>='A' && caracter2<='Z' ) {
            System.out.println("Es letra mayuscula");

        }

        else if (caracter2>='0' && caracter2 <= '9') {
            System.out.println("Es un digito");

        }

        else {
            System.out.println("Es otro");
        }

    }
        
}
    

