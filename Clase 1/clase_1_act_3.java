//Escribir un programa que declare una constante de tipo int y pida el
//ingreso de un valor por teclado. Luego muestre el valor ingresado.
//¿Qué pasa en este caso? ¿Se puede o surge algún problema?
// No pasa nada por que la constante no tiene valor, aunque es mejor una variable

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_1_act_3 {
    public static void main(String[] args) {

        //declaro constante
        final int constante;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); //aplico buffer para teclado

            System.out.println("Ingrese un valor entero: ");
            constante = Integer.valueOf(entrada.readLine()); //guarda el valor
            System.out.println("Se ingreso el numero " + constante);
            
        }
        catch (Exception exc) {
            System.out.println(exc);

        }
    }
}
