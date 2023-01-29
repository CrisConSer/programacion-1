/**
  @author: Christian Millán Soria
  @file: Ej4.java
  @info: ejercicio 4
*/

package tema8.c81.ej4;

import java.util.Scanner;

public class Ej4{
  /**
    @info: función para números primo
    @param x: número
    @return:
      - true: el número es primo
      - false: el número no es primo
  */
    public static int esPrimo(int x){
      // siguiente número
        int num=x+1;

      // bucle infinito
      while(true){
        // de forma predeterminada, el número es primo
          boolean primo=true;

        // comprobación de si es primo
          for(int i=2; i<=(num/2); i++){
            // si no es primo, se acaba el bucle "for" y se sigue ejecutando el bucle "while"
              if(num%i==0){
                primo=false;

                break;
              }
          }

        // si el número sacado del "for" es primo, se devuelve al "main"
          if(primo){
            return num;
          }

        // si no es primo, no se devuelve al "main" y se aumenta en 1 unidad
          num++;
      }
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