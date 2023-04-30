/*
Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class clase_2_act_16 {

    public static void main(String[] args) throws IOException {
        
        char letra; 
        int contador = 0;
        int contadordeA = 0;
        int MAX_A = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {

        while (contador < 15) {
            System.out.println("Ingrese un caracter");
            letra = entrada.readLine().charAt(0);

            if (letra == 'a') {
                contadordeA++;
                
                if (contadordeA > MAX_A) {
                    MAX_A = contadordeA;
                }
            } else {
                contadordeA = 0;
            }

            contador++;
        }


        }catch (Exception exc) {
            System.out.println(exc);
        }

        System.out.println("Se ingresaron " + MAX_A + " letra A consecutivas");


    }
    
}
