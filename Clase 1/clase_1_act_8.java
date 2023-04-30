/*
Escribir un programa que imprima por pantalla la tabla de verdad
para los operadores lógicos or y and (por separado) para dos
valores booleanos. Utilizar los operadores para calcular el
resultado. Por ejemplo, imprimir el siguiente caso para el operador
or:
false or true es: true
y se genera con:
System.out.println(“ false or true es: ” + (false || true)); 
*/



public class clase_1_act_8 {

    public static void main(String[] args) {

        System.out.println("Tabla AND");

        System.out.println(" false and false es: " + (false && false));
        System.out.println(" false and true es: " + (false && true));
        System.out.println(" true and false es: " + (true && false));
        System.out.println(" true and true es: " + (true && true));

        System.out.println("Tabla OR");

        System.out.println(" false or false es: " + (false || false));
        System.out.println(" false or true es: " + (false || true));
        System.out.println(" true or false es: " + (true || false));
        System.out.println(" true or true es: " + (true || true));

    }
    
}
