/*
Escribir un programa que mientras el usuario ingresa un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_7 {

    public static void main(String[] args) {

        char letra = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            

            while (letra != '*') {
                System.out.println("Ingrese un caracter (* para salir)");
                letra = entrada.readLine().charAt(0);

                if (letra >= '0' && letra < '9') {
                    System.out.println("Es un digito");
                }

                else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("Es una vocal minuscula");
                }

                else {
                    System.out.println("Es consonante");

                    
                }
            }
            

        } catch (Exception exc) {
            System.out.println(exc);
        }

        
    }
    
}
