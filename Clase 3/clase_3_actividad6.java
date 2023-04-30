/*
Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class clase_3_actividad6 {
    
    public static void main(String[] args) throws IOException {
        char letra = ' ';

        ObtenerLetra();
        TablaDel9(letra);

       
        
    }

    public static void ObtenerLetra () {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char letra = ' ';
        
        try {
            System.out.println("Ingrese un caracter minuscula");
            letra =entrada.readLine().charAt(0);
            while(letra>='a' && letra<='z') {
             TablaDel9(letra);
             break;
        }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void TablaDel9 (char letra) {
            for(int i = 1; i <= 10; i++) {
                System.out.println(i*9);
            }


    }
    
}
