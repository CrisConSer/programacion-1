/**
  @author: Christian Millán Soria
  @file: Ej5.java
  @info: ejercicio 5
*/

package tema8.c81.ej5;

import java.util.Scanner;

public class Ej5{
  /**
    @info: función para números primo
    @param x: número
    @return:
      - "numDigi": número de dígitos que tiene el número introducido
  */
    public static int digitos(int x){
      int numDigi;

      // conteo
        /*
          alternativa: convertirlo a string y sacar su longitud:
            numDigi=String.valueOf(x).length();
        */

      return numDigi;
    }

  /***************************************************************/

  // main
    public static void main(String[] args){
      // números
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención del número
          System.out.print("Introduce el número: ");
            int n=s.nextInt();

        // cierre scanner
          s.close();

      /************************************/

      // función "digitos"
        System.out.println("\nEl número "+n+" tiene "+digitos(n)+" dígitos.");
    }
}