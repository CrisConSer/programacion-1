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
    public Planetas(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, double distanciaAlSol, double orbitaAlSol, String tieneSatelites){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);

      this.distanciaAlSol=distanciaAlSol;
      this.orbitaAlSol=orbitaAlSol;
      this.tieneSatelites=tieneSatelites;
    }

  /****************************************/

  // métodos
    /**
      @name: muestra
      @info: muestra toda la información de la que se dispone sobre el planeta
    */
      @Override
        public void muestra(){
          
        }
}