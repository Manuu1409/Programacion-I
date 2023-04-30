/*
Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_2_act_12 {

    public static void main(String[] args) {
        char letra, menor = 'z', mayor = 'a';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese una letra minúscula:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {
                if (letra < menor) {
                    menor = letra;
                }

                if (letra > mayor) {
                    mayor = letra;
                }

                System.out.println("Ingrese otra letra minúscula:");
                letra = entrada.readLine().charAt(0);
            }

            System.out.println("La menor letra ingresada es: " + menor);
            System.out.println("La mayor letra ingresada es: " + mayor);

        } catch (Exception exc) {
            System.out.println(exc);
        }


    }
    
}
