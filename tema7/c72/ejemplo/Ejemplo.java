/*
  @author: Christian Millán Soria
  info: ejemplo
*/

package tema7.c72.ejemplo;

public class Ejemplo{
  public static void main(String[] args){
    // array
      // filas y columnas
        int f=5;
        int c=3;

      // creación
        int[][] array=new int[f][c];

      // asignación de valores
        for(int i=0; i<f; i++){
          
        }

      // contenido del array
        System.out.println("+----+----+----+----+----+----+");

        for(int fila=0; fila<f; fila++){
          for(int columna=0; columna<c; columna++){
            System.out.printf("| %-2d ", array[fila][columna]);
          }

          System.out.println("|");
          System.out.print("+----+----+----+----+----+----+");
          System.out.println();
        }
  }
}