/*
 Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_2_act_13 {
    
    public static void main(String[] args) throws IOException {

        char letra =' ';
        int numero = 0;
        final int MAX = 10;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un caracter letra minuscula");
        letra  = entrada.readLine().charAt(0);

        while (letra >= 'a' && letra <= 'z') {
              try {
                System.out.println("Ingrese un numero entero");
                numero = Integer.valueOf(entrada.readLine());

                if (numero >= 1 && numero <=5) {
                    for (int multiplicador = 1; multiplicador <= MAX; multiplicador++) {
                        System.out.println("Tabla de multiplicar de: "+ numero + " * " + multiplicador +" = "+ (numero * multiplicador));
                    }
                }

                
            } catch (Exception exc) {
                System.out.println("exc");
            }

        }

        
    }



    
}
