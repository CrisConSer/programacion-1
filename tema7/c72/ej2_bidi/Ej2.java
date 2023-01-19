/*
  @author: Christian Millán Soria
  info: ejercicio 2
*/

package tema7.c72.ej2_bidi;

import java.util.Scanner;

public class Ej2{
  public static void main(String[] args){
    // array
      // nº elementos
        // filas
          int f=4;

        // columnas
          int c=5;

        // sumas
          int sumaFilas=0;
          int sumaColumnas=0;
          int total=0;

      /******************/

      // creación
        int[][] array=new int[f][c];

      /******************/

      // asignación de valores
        // scanner para obtenerlos
          Scanner s=new Scanner(System.in);

        // obtención
          for(int filas=0; filas<f; filas++){
            for(int columnas=0; columnas<c; columnas++){
              System.out.print("Introduce un número: ");
                array[filas][columnas]=s.nextInt();
            }
          }

        // cierre scanner
          s.close();

    /*********************************************************/

    // comprobar el número con más dígitos de cada columna para adaptar el tamaño
      // array para el número de dígitos máximo de la columna
        int[] maxDigitos=new int[c];

      // 
        for(int filas=0; filas<f; filas++){
          for(int columnas=0; columnas<c; columnas++){
            int maxContado=array[filas][columnas];
            int numDigits=0;

            if(maxContado<0){
              maxContado=-maxContado;
              numDigits++;
            }

            while(maxContado>0){
              numDigits++;
              maxContado/=10;
            }

            maxDigitos[columnas]=Math.max(maxDigitos[columnas], numDigits);
          }
        }

    /*********************************************/

    // debug
      for(int i=0; i<f; i++){
        total+=sumaFilas;
        sumaFilas=0;

        for(int j=0; j<c; j++){
          sumaFilas+=array[i][j];

          System.out.printf("| %-"+maxDigitos[j]+"d ", array[i][j]);

          
        }
        System.out.println(sumaFilas+" |");
      }
  }
}