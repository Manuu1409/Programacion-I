/*
Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima:
a. si el primero es mayor al segundo.
b. si ambos son múltiplos de 2.
*/
import java.io.BufferedReader; 
import java.io.InputStreamReader;
public class clase_1_act_10 {

    public static void main(String[] args) {

        int numero1, numero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese el primer numero");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo numero");
            numero2 = Integer.valueOf(entrada.readLine());

            //a
            System.out.println("¿Numero1 es mayor a numero2? \n " + (numero1>numero2));

            //b
            System.out.println("Ambos son multiplo de 2 ? \n " + (numero1 % 2==0 && numero2 % 2==0));
            
        } catch (Exception exc) {
            System.out.println(exc);
           
        }
        
    }
    
}
