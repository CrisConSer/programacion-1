/*
  @author: Christian Millán Soria
  info: ejercicio 18 bidimensionales
*/

package tema7.c72.ej18_bidi;

public class Ej18{
  public static void main(String[] args){
    // creación del array
      // número de elementos
        int t=10;

      // creación
        int[] array=new int[t];

    /*************************************/

    // asignación de valores aleatorios entre 0-100
      for(int i=0; i<t; i++){
        array[i]=(int)(Math.random()*201);
      }

    /*************************************/

    // índice
      int indice=0;

    /*************************************/

    // reordenamiento
      

    /*************************************/

    // debug
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Indice ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", indice);

        indice++;
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Valor  ");

      // array original
        for(int i=0; i<10; i++){
          System.out.printf("| %-3d ", array[i]);
        }

        System.out.println("|");
        System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
  }
}