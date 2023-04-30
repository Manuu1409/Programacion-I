/*
Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
*/
import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_3 {

    public static void main(String[] args) {

        int numero1;

    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un numero mayor a 50");
        numero1 = Integer.valueOf(entrada.readLine());

        if (numero1 > 50 && numero1 %2 ==0 ) {
            System.out.println(numero1 + " Es multiplo de 2");
        }

        else if (numero1 > 50 && numero1 %3 ==0){
        System.out.println(numero1 + " Es multiplo de 3");
    }
      
         else {
            System.out.println(numero1 + " Es menor a 50 intente de nuevo");
            
        }
        
    } catch (Exception exc) {
        System.out.println(exc);
    }
        
    }

    
    
}
