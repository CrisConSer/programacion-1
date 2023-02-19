/**
  @author: Christian Millán Soria
  @file: Ejemplo4.java
  @info: ejemplo 4
*/

package tema6.c61;

public class Ejemplo4{
  public static void main(String[] args){
    System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");

    for(int i=1; i<=20; i++){
      System.out.println((int)(Math.random()*10+1));
    }
  }
}