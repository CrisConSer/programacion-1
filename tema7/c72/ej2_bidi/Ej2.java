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

          // sumas
            int suma1=0;
            int suma2=0;
            int suma3=0;
            int suma4=0;

        // columnas
          int c=5;

          // sumas
            int suma5=0;
            int suma6=0;
            int suma7=0;
            int suma8=0;
            int suma9=0;

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
        for(int j=0; j<c; j++){
          System.out.printf("| %-"+maxDigitos[j]+"d ", array[i][j]);
        }
        
        System.out.println("|");
      }
  }
}