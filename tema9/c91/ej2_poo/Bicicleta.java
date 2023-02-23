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

  /**
    @info: constructor de la clase "Bicicleta"
    @param p: número de piñones de la bicicleta
  */
    public Bicicleta(int p){
      // llama al constructor sin argumentos de la superclase "Vehiculo"
        super();

      // asigna el valor de "p" al atributo "pinones"
        this.pinones=p;
    }

  /*************************************/

  // métodos
    // realiza la acción de hacer un caballito con la bicicleta
      public void hazCaballito(){
        System.out.print("Estoy haciendo el caballito.");
      }
}