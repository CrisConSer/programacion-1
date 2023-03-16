/**
  @author: Christian Millán Soria
  @file: Satelites.java
  @info: clase "Satelites"
*/

package tema9.c93.ej2_extra.astros;

public class Satelites extends Astros{
  // atributos
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planetas planeta;

  /********************************************/

  // constructor
    public Satelites(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planeta){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);

      this.distanciaAlPlaneta=distanciaAlPlaneta;
      this.orbitaPlanetaria=orbitaPlanetaria;
      this.planeta=planeta;
    }

  /********************************************/

  // métodos
    /**
      @name: muestra
      @info: muestra toda la información de la que se dispone sobre el satélite
    */
    @Override
    public String muestra(){
      String muestra=("\n---------SATÉLITE---------");
        muestra+="\n- Radio ecuatorial: "+getRadioEcuatorial();
        muestra+="\n- Rotación sobre su eje: "+getRotacionSobreSuEje();
        muestra+="\n- Masa: "+getMasa();
        muestra+="\n- Temperatura media: "+getTemperaturaMedia();
        muestra+="\n- Gravedad: "+getGravedad();
        muestra+="\n~~~~~~~~~~~~~~~~~~~~~~~~~";
        muestra+="\n- Distancia al sol: "+this.distanciaAlPlaneta;
        muestra+="\n- Órbita alrededor del sol: "+this.orbitaPlanetaria;
        muestra+="\n- Planeta: "+this.planeta;

      return muestra;
    }
}