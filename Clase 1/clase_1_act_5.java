//Escribir un programa que solicite nombre, edad, altura y ocupación, y
//los imprima por pantalla.

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_1_act_5 {

    public static void main(String[] args) {

        //declaro variables
        String nombre;
        int edad;
        double altura;
        String ocupacion;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese nombre");
            nombre = String.valueOf(entrada.readLine()); //guardo valor, como los que siguen

            System.out.println("Ingrese edad");
            edad = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese altura");
            altura = Double.valueOf(entrada.readLine());

            System.out.println("Ingrese ocupacion");
            ocupacion = String.valueOf(entrada.readLine());

            System.out.println("Segun los datos dados : "  + "\n Nombre: " + nombre + "\n Edad: " + edad + "\n Altura: " + altura + "\n Ocupacion: "  + ocupacion); //muestro por consola

        } catch (Exception exc) {
            System.out.println(exc);
        }
        


    }
    
}
