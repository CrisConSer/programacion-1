/**
  @author: Christian Millán Soria
  @file: Ejemplo2.java
  @info: ejemplo 2
*/

package tema6.c61;

public class Ejemplo2{
  public static void main(String[] args){
    System.out.println("20 números aleatorios entre 0 y 10 sin llegar a 10 (con decimales):");

    for(int i=1; i<=20; i++){
      System.out.println(Math.random()*10);
    }
  }
}