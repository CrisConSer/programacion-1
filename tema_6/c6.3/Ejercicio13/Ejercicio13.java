/*
  @author: Christian Millán Soria
  info: Ejercicio 13 - Tema 6
*/

package Ejercicio13;

public class Ejercicio13{
  public static void main(String[] args){
    //Dos tiradas
      int una;

      int dos;

    //Mientras no sean iguales...
      do{
        //Primera tirada
          una=(int)(Math.random()*6)+1;

        //Segunda tirada
          dos=(int)(Math.random()*6)+1;

        //Impresión por pantalla de cada tirada
          System.out.println("En esta pareja de tirada, en la primera ha salido un "+una+" y en la segunda un "+dos+".");
      }while(una!=dos);
  }
}