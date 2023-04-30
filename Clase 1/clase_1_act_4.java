//Escribir un programa que permita ingresar 5 números de a uno por
//vez y que los muestre por pantalla en orden inverso:
//Ejemplo: Ingreso: 23, 4, 2, 100, 3
//Se debe mostrar: 3, 100, 2, 4, 23

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_1_act_4 {
    
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); //aplico buffer

            System.out.println("Ingrese un numero entero");
            numero1 = Integer.valueOf(entrada.readLine()); //guarda el valor , como los que siguen

            System.out.println("Ingrese un numero entero");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese un numero entero");
            numero3 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese un numero entero");
            numero4 = Integer.valueOf(entrada.readLine());

            System.out.println("Los valores ingresados en orden inverso son: " + numero4 + "," + numero3 + "," + numero2 + "," + numero1); //muestro por consola

        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }

    
}
