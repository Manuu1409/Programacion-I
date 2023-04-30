/*
Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_9 {

    public static void main(String[] args) {
        char letra;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un caracter digito o letra minuscula");
            letra = entrada.readLine().charAt(0);

            if (('a'<=letra)&&(letra<='z') ||  letra >= '0' && letra <='9' ) {

                 if (('a'<=letra)&&(letra<='z')) {
                    System.out.println("Es letra");

                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        System.out.println("Es vocal");
                    }

                    else {
                        System.out.println("Es consonante");
                    }

                } 

                else if (letra >= '0' && letra <='9') {
                    System.out.println("Es numero");

                }

            }
            
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        
    }

    
}
