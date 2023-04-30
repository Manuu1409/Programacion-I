/*
Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_1_act_7 {

    public static void main(String[] args) {

        //declaro variables
        int numero1, numero2,resultado, numero3;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese el primer numero que dividira al siguiente");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo numero a dividir");
            numero2 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el tercer numero que se restara al resultado obtenido de la division");
            numero3 = Integer.valueOf(entrada.readLine());


            System.out.println("El resultado de la division es " + (resultado=numero1 / numero2) + " y restandole lo puesto es " + (resultado - numero3));


        } catch (Exception exc) {
            System.out.println(exc);
        }
        
    }


    
}
