/**
  @author: Christian Millán Soria
  @file: Planetas.java
  @info: clase "Planetas"
*/

package tema9.c93.ej2_extra.astros;

public class Planetas extends Astros{
  // atributos
    private double distanciaAlSol;
    private double orbitaAlSol;
    private String tieneSatelites;

  /****************************************/

  // constructor
    public Planetas(double distanciaAlSol, double orbitaAlSol, String tieneSatelites){

    }

  /****************************************/

  // métodos
    /**
      @name: muestra
      @info: muestra toda la información de la que se dispone sobre el planeta
    */
      public void muestra(){
        System.out.println("Planeta: ");
        System.out.println("Masa: " + getMasa() + " kg");
        System.out.println("Diámetro: " + getDiametro() + " km");
        System.out.println("Periodo de rotación: " + getPeriodoRotacion() + " horas");
        System.out.println("Periodo de traslación: " + getPeriodoTranslacion() + " días");
        System.out.println("Distancia media: " + getDistanciaMedia() + " km");
        System.out.println("Número de satélites: " + numSatelites);
      }
}