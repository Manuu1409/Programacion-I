/*
Escribir un programa que pida se ingresen datos necesarios para
emitir una factura por la compra de dos artículos de librería (tipo
factura, número, nombre cliente, producto 1, importe 1, producto 2,
importe 2, importe total). Como salida debe imprimir por pantalla la
factura en un formato similar al del siguiente ejemplo:
Factura C N 249
Nombre: Juan Perez
Producto Importe
Lápiz 15.5
Papel 20.6
Importe total 36.1
*/

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class clase_1_act_6 {

    public static void main(String[] args) {

        //declaro variables
        char tipo_factura;
        int numero_factura;
        String nombre_cliente;
        String producto_1;
        String producto_2;
        int importe_1;
        int importe_2;
       // int importe_total;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese tipo de factura");
            tipo_factura = entrada.readLine().charAt(0); //guardo lo que pone el usuario

            System.out.println("Ingrese numero de factura");
            numero_factura = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese nombre del cliente");
            nombre_cliente = String.valueOf(entrada.readLine());

            System.out.println("Ingrese el primer producto");
            producto_1 = String.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe del primer producto");
            importe_1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo producto");
            producto_2 = String.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe del segundo producto");
            importe_2 = Integer.valueOf(entrada.readLine());

            System.out.println("Factura \t" + tipo_factura + "\t" + numero_factura + "\nNombre: " + nombre_cliente + "\nProducto \tImporte \n" + producto_1 + "\t \t" + importe_1 + "\n" + producto_2 + "\t \t" + importe_2 + "\nImporte total \t" + (importe_1+importe_2));




        } catch(Exception exc) {
        System.out.println(exc);
    }

  }
}
    

