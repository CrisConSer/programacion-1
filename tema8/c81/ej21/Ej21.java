/**
  @author: Christian Millán Soria
  @file: Ej21.java
  @info: ejercicio 21
*/

package tema8.c81.ej21;

import java.util.Scanner;

public class Ej21{
  /**
    @info:función para generar un array
    @param:
      - "x": nº de elementos
      - "y": intervalo menor
      - "z": intervalo mayor
    @return array: array generado
  */
    public static int[] generaArrayInt(int x, int y, int z){
      // array
        // nº de elementos
        int t=x;

        // creación
          int[] array=new int[t];

        // asignación de valores
          for(int i=0; i<t; i++){
            array[i]=(int)(Math.random()*(z-y+1)+y);
          }

      /**********************************/

      // return
        return array;
    }

    /***********************************************************/

    /**
      @info: función para obtener el mínimo de array
      @param int[] x: array del que se saca el mínimo
      @return min: valor mínimo del array
    */
      public static int minimoArrayInt(int[] x){
        // variable para el mínimo
          int min=Integer.MAX_VALUE;

        /*********************/

        // recorrer array
          for(int i=0; i<x.length; i++){
            if(x[i]<min){
              min=x[i];
            }
          }

        /*********************/

        // return
          return min;
      }

    /***********************************************************/

    // main
      public static void main(String[] args){
        // scanner
          Scanner s=new Scanner(System.in);

          /************************/

          // nº de elementos
            System.out.print("Introduce el número de elementos que debe tener el array: ");
              int ele=s.nextInt();

          /************************/

          // intervalo menor
          System.out.print("Introduce el valor mínimo del intervalo de los valores: ");
            int min=s.nextInt();

          /************************/

          // intervalo menor
          System.out.print("Introduce el valor máximo del intervalo de los valores: ");
            int max=s.nextInt();

        // cierre de scanner
          s.close();

        /***********************************/

        // debug
          System.out.println("\n");

          for(int i=0; i<ele; i++){
            System.out.printf("| %-5d", generaArrayInt(ele, min, max)[i]);
          }
          
          System.out.println(" |");

        /***********************************/

        // mínimo
          System.out.print("\nEl valor mínimo de este array es el "+minimoArrayInt((generaArrayInt(ele, min, max))));
      }
}