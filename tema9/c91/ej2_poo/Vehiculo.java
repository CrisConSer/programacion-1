/**
  @author: Christian Millán Soria
  @file: Ej2.java
  @info: ejercicio 2 - poo java
*/

package tema9.c91.ej2_poo;

public abstract class Vehiculo{
  // atributos de clase
    private static int kmTotales=0;
    private static int vehiculosCreados=0;

  /***************************************/

  // atributos de instancia
    private int kmRecorridos;

  /***************************************/

  // 
    public Vehiculo(){
      this.kmRecorridos=0;
    }

  /*****************/

  // 
    public int getKmRecorridos(){
      return this.kmRecorridos;
    }

  /*****************/

  // 
    public static int getKmTotales(){
      return Vehiculo.kmTotales;
    }

  /***************************************/

  /**
    @info: distancia recorrida por un vehículo
    @param k: kilómetros a recorrer
  */
    public void recorre(int k){
      this.kmRecorridos+=k;

      Vehiculo.kmTotales+=k;
    }
}