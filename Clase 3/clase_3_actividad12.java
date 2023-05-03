/*
Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:
dado = (int) (6*Math.random() + 1)
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_3_actividad12 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        final int MAX = 1000;
        int numero, contador = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese numero entre 1 y 6 incluidos para simulacion del dado");
        numero = Integer.valueOf(entrada.readLine());

        for (int i = 1; i < MAX; i++ ) {
            int dado = (int) (6*Math.random() + 1);
            if (dado == numero) {
                contador++;
            }


        }

        System.out.println("El numero " + numero + " salio " + contador + " veces entre 1000 lanzamientos de dados");

    }
    
    
}
