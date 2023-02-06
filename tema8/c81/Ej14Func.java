/**
  @author: Christian Millán Soria
  @file: Ej14Func.java
  @info: ejercicio 14 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej14Func{
  public static void main(String[] args){
    // caracter y nº de líneas
      // scanner
        Scanner s=new Scanner(System.in);

        /***************/

        // caracter
          System.out.print("Introduce el caracter a utilizar para imprimir el triángulo: ");
            char c=s.next().charAt(0);

        // nº de líneas
          System.out.print("Introduce el número de líneas que debe tener el triángulo: ");
            int n=s.nextInt();

        /***************/

      // cierre scanner
        s.close();

    /*****************************************/

    // debug
      Varias.printTiangulo(c,n);
  }
}