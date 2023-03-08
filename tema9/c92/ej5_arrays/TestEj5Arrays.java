/**
  @author: Christian Millán Soria
  @file: TestEj5Arrays.java
  @info: programa principal del ejercicio 5 de arrays
*/

package tema9.c92.ej5_arrays;

import java.util.Scanner;

public class TestEj5Arrays{
  public static void main(String[] args){
    // array
      Gestisimal[] productos=new Gestisimal[1];

    /*************************************/

    // menú
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");

      // scanner
        System.out.print("\nElige una opción: ");
          Scanner input=new Scanner(System.in);
            int opcion=input.nextInt();

      /****** **********************/

      switch(opcion){
        case 1:
          Gestisimal.listado();
        break;

        /******************/

        case 2:
          // obtención de datos
            System.out.print("Introduce la descripción del nuevo producto: ");
              String descripcion=input.next();
            System.out.print("Introduce el precio de compra del nuevo producto: ");
              double precioCompra=input.nextDouble();
            System.out.print("Introduce el precio de venta del nuevo producto: ");
              double precioVenta=input.nextDouble();

          // creación de la nueva instancia
            Gestisimal nuevoProducto=new Gestisimal(descripcion, precioCompra, precioVenta);
        break;
      }
  }
}