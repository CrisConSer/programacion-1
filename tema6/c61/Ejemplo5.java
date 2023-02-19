/**
  @author: Christian Millán Soria
  @file: Ejemplo5.java
  @info: ejemplo 5
*/

package tema6.c61;

public class Ejemplo5{
  public static void main(String[] args){
    System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");

    for(int i=1; i<=20; i++){
      System.out.println((int)(Math.random()*11+50));
    }
  }
}