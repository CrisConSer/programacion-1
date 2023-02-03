/**
  @author: Christian Millán Soria
  @file: Ej8Func.java
  @info: ejercicio 8 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej8Func{
  public static void main(String[] args){
    // número
      // scanner
        Scanner s=new Scanner(System.in);

      /***************/

        // obtención de números
          System.out.print("Introduce el número: ");
            int n=s.nextInt();

      /***************/

      // cierre de scanner
        s.close();

    /****************************************/

    // suma
      System.out.println("La suma de los números desde 1 a "+n+" es: "+Varias.suma1aN(n)+".");
  }
}