/*
Escribir un programa que solicite una hora del día (valor entero de
la hora solamente) y resuelva en cada caso:
a. Si la hora está entre las 0 y las 5, pida ingresar la
temperatura y si la misma es menor a 20 grados imprima
“Encender la calefacción”. Si es mayor a 25, imprima
“Apagar calefacción”. Si está en el rango de 20 a 25 imprima
“Calefacción encendida, no abra las ventanas!!!”.
b. Si la hora está entre las 6 y las 11, pida un carácter letra
minúscula y si es vocal imprima por la consola la cantidad de
vocales que tiene la palabra que corresponde con la hora.
Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
tiene 2 consonantes.
c. Si la hora está entre las 12 y 17 y es par, imprima el
promedio entre la hora ingresada y el límite inferior del
rango. Si la hora es impar debe imprimir el promedio entre la
hora ingresada y el límite superior del rango.
d. Si la hora está entre las 18 y 23, pida ingresar una clave
numérica, si coincide con la clave almacenada previamente
en una constante, pida ingresar una segunda clave de
verificación (un valor entre 100 y 999). Para esta segunda
clave (que solo la conoce el usuario) se debe verificar que el
el dígito de mayor peso (centena) es múltiplo del dígito de
mayor peso de la clave almacenada. Si todo esto se cumple
debería mostrar por la consola el mensaje “Clave correcta”.
Ejemplo: clave almacenada 364, clave ingresada 364,
segunda clave ingresada 698.
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_2_act_5 {

    public static void main(String[] args) {

        int hora;
        int temperatura;
        char letra1;

        try {

            //a
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese una hora del dia");
            hora = Integer.valueOf(entrada.readLine());

            if (hora >=0 && hora <= 24 && hora >=0 && hora <=5) {
                System.out.println("Ahora ingrese la temperatura");
                temperatura = Integer.valueOf(entrada.readLine());

                if (temperatura < 20) {
                    System.out.println("Encender calefaccion");
                }

                else if (temperatura > 25) {
                    System.out.println("Apagar calefaccion");

                }

                else if (temperatura >=20 && temperatura <=25) {
                    System.out.println("Calefacción encendida, no abra las ventanas!!!");

                }
                
            }
             if (hora >=6 && hora <=11) {
                System.out.println("Ingrese un caracter minuscula");
                letra1 = entrada.readLine().charAt(0);
                
                if (letra1 == 'a' || letra1 == 'e' || letra1 == 'i' || letra1 == 'o' || letra1 == 'u') {
                switch (hora) {
                    case '6': System.out.println("Seis tiene 2 vocales");
                    break;
                    case '7': System.out.println("Siete tiene 3 vocales");
                    break;
                    case '8': System.out.println("Ocho tiene 2 vocales");
                    break;
                    case '9': System.out.println("Nueve tiene 3 vocales");
                    break;
                    default: System.out.println("Valor no encontrado");
                    
                    
                }
            }

            }
           

            


            
        } catch (Exception exc) {
            System.out.println(exc);
            
        }
        
    }
    
}
