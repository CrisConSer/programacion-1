/*
  @author: Christian Millán Soria
  info: ejercicio 14
*/

package tema7.c71.ej14;

import java.util.Scanner;

public class Ej14{
  public static void main(String[] args){
    // array
      // número de elementos
        int t=8;

      // creación
        String[] n=new String[t];

    /*****************************/

    // array para los colores predeterminados
      String[] colores={"rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    // array auxiliar
      String[] aux={};

    /*****************************/

    // elementos
      // scanner
        Scanner s=new Scanner(System.in);

      // palabras
        for(int i=0; i<t; i++){
          System.out.print("Introduce una palabra: ");
            n[i]=s.nextLine();
        }

      // cierre scanner
        s.close();

      // a minúsculas
        for(int i=0; i<t; i++){
          n[i]=n[i].toLowerCase();
        }

    /*****************************/

    // 
  }
}