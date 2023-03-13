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
      // tamaño
        int t=500;

      /**************/

      // creación
        Gestisimal[] productos=new Gestisimal[t];

    /***********************************************/

    // variables necesarias
      Scanner input=new Scanner(System.in);

      int primeraLibre;
      String codigo;

      String codigoIntroducido;

    /***********************************************/

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
          int opcion=input.nextInt();

    /***********************************************/

    // inicialización de los huecos del array
      for(int i=0; i<t; i++){
        productos[i]=new Gestisimal();
      }

    /***********************************************/

    // switch para las opciones
      switch(opcion){
        case 1:// listado
          System.out.println("\nListado");

          for(int i=0; i<t; i++){
            if(!productos[i].getCodigo().equals("libre")){
              System.out.println(productos[i]);
            }
          }
        break;

        /******************/

        case 2:// alta
          System.out.println("Dar de alta nuevo artículo");

          // primer hueco libre en el array
            primeraLibre=0;// reseteo a 0 (primer elemento del array)
            codigo=productos[primeraLibre].getCodigo();// reseteo de la variable "codigo" a la del primer elemento del array

            /**************/

            // conversión de "primeraLibre" y "codigo" a los del primer elemento libre
              while((primeraLibre<t)&&(!codigo.equals("libre"))){
                primeraLibre++;

                if(primeraLibre<t){
                  codigo=productos[primeraLibre].getCodigo();
                }
              }

            /**************/

            // comprobación de si hay espacio en el almacén
              if(primeraLibre==t){
                System.out.println("No hay espacio en el almacén para nuevos artículos.");
              }else{
                System.out.println("Introduce los datos del nuevo artículo.");
                  // código
                    System.out.print("Código: ");
                      codigoIntroducido=input.next();

                      // comprobación de la existencia del código introducido
                        for(int i=0; i<t; i++){
                          if(productos[i].getCodigo().equals(codigoIntroducido)){
                            System.out.println("El código introducido ya existe.");
                            break;
                          }else{
                            productos[i].setCodigo(codigoIntroducido);

                            // descripción
                              System.out.print("Descripción: ");
                                productos[i].setDescripcion(input.next());

                            // precio d ecompra
                              System.out.print("Precio de compra: ");
                                productos[i].setPrecioCompra(input.nextDouble());

                            // precio de venta
                              System.out.print("Precio de venta: ");
                                productos[i].setPrecioVenta(input.nextDouble());

                            // stock
                              System.out.print("Stock: ");
                                productos[i].setStock(input.nextInt());
                          }
                        }
              }
        break;
      }
  }
}