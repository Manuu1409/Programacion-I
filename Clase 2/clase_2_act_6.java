/*
Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes).
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_6 {
    
    public static void main(String[] args) {
        int numero1;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un numero entre 0 y 100");
            numero1 = Integer.valueOf(entrada.readLine());

            if (numero1 > 0 && numero1 < 100 && numero1%2==0 && numero1%3==0) {
                System.out.println(numero1 + " Es multiplo de 2 y 3");
            }
            else {
                System.out.println(numero1 + " No es multiplo de 2 y 3 o te pasaste del limite");
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }

        
    }
    
}
