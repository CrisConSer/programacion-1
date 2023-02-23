/**
  @author: Christian Millán Soria
  @file: Bicicleta.java
  @info: clase "Bicicleta" del ejercicio 2
*/

package tema9.c91.ej2_poo;

public class Bicicleta extends Vehiculo{
  // nº de piñones
    private int pinones;

  /*************************************/

  // 
    public Bicicleta(int p){
      super();

      this.pinones=p;
    }

  /*************************************/

  // 
    public void hazCaballito(){
      System.out.print("Estoy haciendo el caballito.");
    }
}