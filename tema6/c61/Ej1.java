/**
  @author: Christian Millán Soria
  @file: Ej1.java
  @info: ejercicio 1
*/

package tema6.c61;

public class Ej1{
  public static void main(String[] args){
    // variable para la suma
      int suma=0;

    /*************************/

    // variable auxiliar
      int aux;

    /*************************/

    // tiradas y suma
      System.out.println("Estas son las 3 tiradas de dados:");
      System.out.println();

      for(int i=0; i<3; i++){
        aux=(int)(Math.random()*6+1);

        System.out.println(aux);

        suma+=aux;
      }

    /*************************/

    // debug
      System.out.print("\nLos puntos que suman las 3 tiradas son "+suma+".");
  }
}