/**
  @author: Christian Millán Soria
  @file: Ejemplo6.java
  @info: ejemplo 6
*/

package tema7.repaso.ejemplo6;

import java.util.Scanner;

public class Ejemplo6{
  public static void main(String[] args){
    // scanner
      Scanner s=new Scanner(System.in);

    // tamaño array
      System.out.print("Introduce el tamaño que debe tener el array: ");
        int t=s.nextInt();

      System.out.println();

    // cierre de scanner
      s.close();

    /***********************************/
    
    // máximo y mínimo
      int max=Integer.MIN_VALUE;
    
    /***********************************/

    // array
      // creación
        int[] array=new int[t];

      // asignación de valores
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*11+50);

          if(array[i]>max){
            max=array[i];
          }
        }

      /***********************************/

      // debug
        for(int i=0; i<t; i++){
        if(array[i]>=max){
          System.out.printf("| **%-2d** ", array[i]);
          }else{
            System.out.printf("| %-2d ", array[i]);
          }
        }

        System.out.print("|");
  }
}