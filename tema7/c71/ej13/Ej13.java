/*
  @author: Christian Millán Soria
  info: ejercicio 13
*/

package tema7.c71.ej13;

import java.util.Scanner;

public class Ej13{
  public static void main(String[] args){
    // array
      // tamaño
        int t=100;

      // creación
        int[] n=new int[t];

    /************************************/

    // auxiliares
      // max
        int max=Integer.MIN_VALUE;

      // min
        int min=Integer.MAX_VALUE;

    /************************************/

    // asignación de valores aleatorios
      for(int i=0; i<t; i++){
        n[i]=(int)(Math.random()*501);
      }

    /************************************/

    // máximo o mínimo
      // scanner
        Scanner s=new Scanner(System.in);

      // pregunta
        System.out.print("¿Quieres destacar el máximo valor (1) o el mínimo (2)? -> ");
          int opt=s.nextInt();

      // cierre de scanner
        s.close();

      /**************************/

      // máximo
        if(opt==1){
          
        }
  }
}