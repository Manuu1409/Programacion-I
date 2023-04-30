/*
 Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año, y
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_2 {

    public static void main(String[] args) {

        int numero1;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Elije un numero del mes");
            numero1 = Integer.valueOf(entrada.readLine());

            switch (numero1) {
                case 1: System.out.println("Enero tiene 31 dias ");
                break;
                case 2: System.out.println("Febrero tiene 28 dias");
                break;
                case 3: System.out.println("Marzo tiene 31 dias");
                break;
                case 4: System.out.println("Abril tiene 30 dias");
                break;
                case 5: System.out.println("Mayo tiene 31 dias");
                break;
                case 6: System.out.println("Junio tiene 30 dias");
                break;
                case 7: System.out.println("Julio tiene 31 dias");
                break;
                case 8: System.out.println("Agosto tiene 31 dias");
                break;
                case 9: System.out.println("Septiembre tiene 30 dias");
                break;
                case 10: System.out.println("Octubre tiene 31 dias");
                break;
                case 11: System.out.println("Noviembre tiene 30 dias");
                break;
                case 12: System.out.println("Diciembre tiene 31 dias");
                break;
                
            
                default: System.out.println("No es mes");
                break;
            }
            
        } catch (Exception exc) {
            System.out.println(exc);
        }


        
    }
    
}
