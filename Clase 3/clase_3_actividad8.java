/*
Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por pantalla el
resultado de la operación matemática básica considerando el valor
del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números.
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class clase_3_actividad8 {
    static int numero1, numero2;

    public static void main(String[] args) {
        obtenerNumeros();
        char operacion = obtenerOperacion();
        double resultado = realizarOperacion(operacion);
        System.out.println("El resultado de la operación es: " + resultado);
    }

    public static void obtenerNumeros() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese el primer numero:");
            numero1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo numero:");
            numero2 = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static char obtenerOperacion() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char operacion = ' ';

        try {
            System.out.println("Ponga a para sumar, b para restar, c para multiplicar, d para dividir ");
            operacion = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }

        return operacion;
    }

    public static double realizarOperacion(char operacion) {
        double resultado = 0;
        
        switch (operacion) {
            case 'a':
                resultado = numero1 + numero2;
                break;
            case 'b':
                resultado = numero1 - numero2;
                break;
            case 'c':
                resultado = numero1 * numero2;
                break;
            case 'd':
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Operación inválida");
                break;
        }
        
        return resultado;
    }
}

    
    



//System.out.println("Letra a para sumar, b para restar, c para multiplcar y d para dividir ambos numeros");
//letra = entrada.readLine().charAt(0);