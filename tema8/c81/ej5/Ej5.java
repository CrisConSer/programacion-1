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
      - true: el número es primo
      - false: el número no es primo
  */
    public static int potencia(int x, int y){
      int resultado=(int)(Math.pow(x, y));

      return resultado;
    }

  /***************************************************************/

  // main
    public static void main(String[] args){
      // números
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención de la base
          System.out.print("Introduce la base: ");
            int b=s.nextInt();

        // obtención del exponente
          System.out.print("Introduce la base: ");
            int e=s.nextInt();

        // cierre scanner
          s.close();

      /************************************/

      // función "potencia"
        System.out.println("\nEl resultado de la potencia de "+b+" elevado a "+e+" es "+potencia(b, e)+".");
    }
}