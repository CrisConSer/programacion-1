/**
  @author: Christian Millán Soria
  @file: ej3.java
  @info: ejercicio 3
*/

package tema8.c81.ej3;

import java.util.Scanner;

public class Ej3{
  /**
    @info: función para números primo
    @param x: número
    @return:
      - true: el número es primo
      - false: el número no es primo
  */
    public static int esPrimo(int x){
      // comprobación de divisores
        for(int i=2; i<=x/2; i++){
          x++;

          if(x%i==0){
            return x;
          }
        }
        return x;
    }

  /***************************************************************/

  // main
    public static void main(String[] args){
      // número
        // scanner
          Scanner s=new Scanner(System.in);

        // obtención del número
          System.out.print("Introduce el número: ");
            int n=s.nextInt();

        // cierre scanner
          s.close();

      /************************************/

      // función "esPrimo"
        System.out.println("\nEl siguiente valor primo es el "+esPrimo(n)+".");
    }
}