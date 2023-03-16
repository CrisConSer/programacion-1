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
    public Planetas(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad, String nombre, double distanciaAlSol, double orbitaAlSol){
      super(radioEcuatorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad, nombre);

      this.distanciaAlSol=distanciaAlSol;
      this.orbitaAlSol=orbitaAlSol;
    }

  /****************************************/

  // métodos
    /**
      @name: muestra
      @info: muestra toda la información de la que se dispone sobre el planeta
    */
      @Override
        public String muestra(){
          String muestra=("\n\n---------PLANETA---------");
            muestra+="\n- Nombre: "+getNombre();
            muestra+="\n- Radio ecuatorial: "+getRadioEcuatorial()+" km";
            muestra+="\n- Rotación sobre su eje: "+getRotacionSobreSuEje()+" horas";
            muestra+="\n- Masa: "+getMasa()+" kg";
            muestra+="\n- Temperatura media: "+getTemperaturaMedia()+" ºC";
            muestra+="\n- Gravedad: "+getGravedad()+" m/s^2";
            muestra+="\n- Distancia al sol: "+this.distanciaAlSol+" km";
            muestra+="\n- Órbita alrededor del sol: "+this.orbitaAlSol+" días";
            muestra+="\n- Satélites: ";

          return muestra;
        }
}