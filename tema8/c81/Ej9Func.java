/**
  @author: Christian Millán Soria
  @file: Ej9Func.java
  @info: ejercicio 9 del listado de funciones
*/

package tema8.c81;

import tema8.c81.misFunciones.Varias;

import java.util.Scanner;

public class Ej9Func{
  public static void main(String[] args){
    // números
      // scanner
        Scanner s=new Scanner(System.in);

      /**************/

        // primer número
          System.out.print("Introduce el primer número: ");
            int num1=s.nextInt();

        /*********/

        // segundo número
          System.out.print("Introduce el segundo número: ");
            int num2=s.nextInt();

        /*********/

        // tercer número
          System.out.print("Introduce el tercer número: ");
            int num3=s.nextInt();

      /**************/

      // cierre de scanner
        s.close();
  }
}