/*
 * @author: Christian Millán Soria
 * date: 20/12/2022
 * description: Punto 6.1 - Ejemplo 3
 */

package tema6.c61.ejemplo3;

public class Ejemplo3{
  public static void main(String[] args){
    System.out.println("20 números aleatorios entre 1 y 15 (sin decimales):");

    for(int i=1; i<=15; i++){
      System.out.println((int)(Math.random()*15+1));
    }
  }
}