/*
Realizar un programa que, dada una opción entera (1,2,3,4),
permita realizar operaciones entre tres números reales (r1,r2,r3)
ingresados desde teclado. Para la opción:
1. Calcular la raíz cuadrada de (r1-r3)
2. Calcular el promedio de r1, r2 y r3
3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
r1
4. Calcular el cociente del promedio de los tres valores dividido
por la raíz cuadrada de r2
Observación: La raíz cuadrada de un número se calcula con la
sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
y de la modularización para la solución. Tener en cuenta posibles
errores o excepciones como la división por cero.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_3_actividad13 {
    static int r1, r2, r3;
    
    public static void main(String[] args) {
        obtenerNumeros();
        int operacionInt = obtenerOperacion();
        double resultadoInt = realizarOperacion(operacionInt);
        System.out.println("El resultado es: " + resultadoInt);

    }

    public static void obtenerNumeros() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Ingrese el primer numero:");
            r1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo numero:");
            r2 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el tercer numero:");
            r3 = Integer.valueOf(entrada.readLine());


        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static int obtenerOperacion() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int operacion = 0;

        try {
            System.out.println("Ponga 1 para la raiz cuadrada de r1 y r2 -- 2 para el promedio de r1,r2 y r3 -- 3 para el cociente de la raíz cuadrada de (r3 - r2) dividida por r1 -- 4 para cociente del promedio de los tres valores dividido por la raíz cuadrada de r2 ");
            operacion = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println(exc);
        }

        return operacion;
    }

    public static double realizarOperacion(int operacionInt2) {
        double resultado = 0;
        
        switch (operacionInt2) {
            case '1':
                resultado = r1 + r2;   //ejemplo para ver si anda
                break;
            case '2':
               // aca iria la operacion pero no tengo ganas de hacerlo
                break;
            case '3':
               // aca iria la operacion pero no tengo ganas de hacerlo
                break;
            case '4':
              //  aca iria la operacion pero no tengo ganas de hacerlo
                break;
            default:
                System.out.println("Pusiste otro numero");
                break;
            }
        
        return resultado;
    }
    
}
