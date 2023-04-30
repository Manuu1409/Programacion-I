/*
Escribir un programa completo (declaración de constantes y
variables, carga de datos, procesamiento e impresión de
resultados) para cada caso o ítem que:
a. solicite un número e indique si es positivo o negativo.
b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.
c. solicite un número del 1 al 7 e imprima el día de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_1 {
    public static void main(String[] args) {

        //declaracion variables
        int numero1, numero2, numero3, numero4, numero5, numero6; 
        char letra1;

        //a. solicite un número e indique si es positivo o negativo.
        
        try {
          BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Ingrese un numero");
          numero1 = Integer.valueOf(entrada.readLine());

         if (numero1 >=0) {
            System.out.println("Es un numero positivo");
         }
        
         else {
            System.out.println("Es un numero negativo");
         }
     

        //b. solicite un número e imprima “grande” si es mayor a 100 y “chico “ si es menor.

       
  
         System.out.println("Ingrese numero");
         numero2 = Integer.valueOf(entrada.readLine());

         if(numero2 > 100) {
            System.out.println("Grande");
         }
        
         else {
            System.out.println("Chico");
         }
    
        //c. solicite un número del 1 al 7 e imprima el día de la semana

    System.out.println("Ingrese numero entre 1 y 7");
    numero3 = Integer.valueOf(entrada.readLine());

    switch (numero3) {
        case 1: System.out.println("Es lunes");
        break;
        case 2: System.out.println("Es martes");
        break;
        case 3: System.out.println("Es miercoles");
        break;
        case 4: System.out.println("Es jueves");
        break;
        case 5: System.out.println("Es viernes");
        break;
        case 6: System.out.println("Es sabado");
        break;
        case 7: System.out.println("Es domingo");
        break;
    
        default: System.out.println("No es un dia");
        break;
    }


    //solicite una letra e imprima si es vocal o consonante.

        System.out.println("Ingrese una letra una letra");
        letra1 = entrada.readLine().charAt(0);

        if (letra1 == 'a' || letra1 == 'e' || letra1 == 'i' || letra1 == 'o' || letra1 == 'u' ) {
            System.out.println("Es vocal");
            
        } 
        else {
            System.out.println("Es consonante");
            
        }

    //e. solicite 3 números e imprima “creciente” si los tres númerosestán en orden creciente, “decreciente” si están en orden decreciente o “error” si no cumplen ningún orden

    System.out.println("Ingrese un numero");
    numero4 = Integer.valueOf(entrada.readLine());
    
    System.out.println("Ingrese el segundo numero");
    numero5 = Integer.valueOf(entrada.readLine());

    System.out.println("Ingrese el tercer numero");
    numero6 = Integer.valueOf(entrada.readLine());

   // if () {
        
   // } else {
        
   // }

    
        
    } catch (Exception exc) {
        System.out.println(exc);
    }



}

        
 }
           

