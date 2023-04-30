/*
Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive.
 */


 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class clase_2_act_17 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int numero;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero ");
        numero = Integer.valueOf(entrada.readLine());

        try {
  
        if (numero > 0 && numero < 10) {
            System.out.println("Contador para atras");

            for (int i = numero;  i >= 0; i--) {
                System.out.print(i);
            }

        } 
    
      } catch (Exception exc) {
            System.out.println(exc);
        }



        
    }
    
}
