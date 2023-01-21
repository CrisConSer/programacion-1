/*
  @author: Christian Millán Soria
  info: ejercicio 11 bidimensionales
*/

package tema7.c72.ej11_bidi;

public class Ej11{
  public static void main(String[] args){
    // array
      // filas y columnas
        int filas=10;
        int columnas=10;

      // creación
        int[][] array=new int[filas][columnas];

      // asignación de valores
        for(int i=0; i<filas; i++){
          for(int j=0; j<columnas; j++){
            array[i][j]=(int)(Math.random()*101+200);
          }
        }

      // debug
        for(int i=0; i<filas; i++){
          for(int j=0; j<columnas; j++){
            System.out.println(array[i][j]);
          }
        }
  }
}