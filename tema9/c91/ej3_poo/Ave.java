/**
  @author: Christian Millán Soria
  @file: Ave.java
  @info: clase "Ave" - ejercicio 3
*/

package tema9.c91.ej3_poo;

public class Ave extends Animal{
  // constructor
    public Ave(String nombre, int edad){
      super(nombre, edad);
    }

  /************************************/

  // métodos
    // volar
      public void volar(){
        System.out.print("El ave está volando.");
      }

    /****************/

    // picotear
      public void picotear(){
        System.out.print("El ave está picoteando.");
      }
}