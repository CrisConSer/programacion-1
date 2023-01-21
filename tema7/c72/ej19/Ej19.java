/*
  @author: Christian Millán Soria
  info: ejercicio 19
*/

package tema7.c72.ej19;

public class Ej19{
  public static void main(String[] args){
    // array original
      // número de elementos
        int t=12;

      // creación
        int[] array=new int[t];

      // asignación de valores aleatorios
        for(int i=0; i<t; i++){
          array[i]=(int)(Math.random()*201);
        }

      /*****************************************/

      // muestra array original
        int indice=0;

        System.out.print("Indice ");
        for(int i=0; i<12; i++){
          System.out.printf(" %-3d ", indice);
  
          indice++;
        }

        System.out.print("\nValor  ");
        for(int i=0; i<12; i++){
          System.out.printf(" %-3d ", array[i]);
        }
  }
}