/*
Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_2_act_11 {

    public static void main(String[] args) {

        char letra;
        int sumaVocales=0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese caracter minuscula");

    while(true) {
        try {
            letra =entrada.readLine().charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            sumaVocales++;

            }

            else {
                break;
            }
            
            
        } catch (Exception exc) {
            System.out.print(exc);
        }
        System.out.println("La suma de vocales son: " + sumaVocales);
        
    }
    


    }


}
