/**
  @author: Christian Millán Soria
  @file: TestEj1Arrays.java
  @info: programa principal del ejercicio 1 de arrays
*/

package tema9.c92.ej1_arrays;

import java.util.Scanner;

public class TestEj1Arrays{
  public static void main(String[] args){
    // array
      // creación
        Gato[] gatos=new Gato[4];

      /******************/

      // generación de instancias
        // scanner
          Scanner input=new Scanner(System.in);
            String sexo;// sexo que se le aplica a cada gato

        // bucle
          for(int i=0; i<4; i++){
            System.out.print("Sexo del nuevo gato (macho/hembra): ");
              sexo=input.next();

            gatos[i]=new Gato(sexo);
          }

      /*************************************/

      // info de todos los gatos
        for(int i=0; i<4; i++){
          System.out.println(gatos[i].toString(i+1));
        }
  }
}