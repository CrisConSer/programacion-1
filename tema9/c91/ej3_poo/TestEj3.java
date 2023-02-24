/**
  @author: Christian Millán Soria
  @file: TestEj3.java
  @info: test ejercicio 3
*/

package tema9.c91.ej3_poo;

public class TestEj3{
  public static void main(String[] args){
    // instancia de la clase "Ave"
      Ave ave1=new Ave("Piolín", 5);

    /*********************/

    // interacciones
      ave1.volar();
      System.out.println("Nombre de la ave: "+ave1.getNombre());
      System.out.println("Edad de la ave: "+ave1.getEdad());
  }
}