/*
  @author: Christian Millán Soria
  info: Ejercicio 22 - Tema 6
*/

package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);

    //Obtención de la longitud de la serpiente
      System.out.print("Introduce la longitud de la serpiente (contando la cabeza): ");
        int longitud=s.nextInt();

    //Cabeza
      System.out.println("     @");

    //Cuerpo
      int x=13;

      while(longitud>1){
        x+=(int)(Math.random()*3)-1;

        for(int i=1; i<x; i++){
          System.out.print(" ");
        }

        System.out.println("*");

        longitud++;
      }

    //Cierre de Scanner
      s.close();
  }
}