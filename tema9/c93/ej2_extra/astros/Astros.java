/**
  @author: Christian Millán Soria
  @file: Astros.java
  @info: clase abstracta "Astros"
*/

package tema9.c93.ej2_extra.astros;

public abstract class Astros{
  // atributos
    private double radioEcuatorial;
    private double rotacionSobreSuEje;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

  /*******************************************/

  // constructor
    public Astros(double radioEcuatorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad){
      this.radioEcuatorial=radioEcuatorial;
      this.rotacionSobreSuEje=rotacionSobreSuEje;
      this.masa=masa;
      this.temperaturaMedia=temperaturaMedia;
      this.gravedad=gravedad;
    }

  /*******************************************/

  // métodos
    // getter "radioEcuatorial"
      public double getRadioEcuatorial(){
        return this.radioEcuatorial;
      }

    /***************/

    // getter "rotacionSobreSuEje"
      public double getRotacionSobreSuEje(){
        return this.rotacionSobreSuEje;
      }

    /***************/

    // getter "masa"
      public double getMasa(){
        return this.masa;
      }

    /***************/

    // getter "temperaturaMedia"
      public double getTemperaturaMedia(){
        return this.temperaturaMedia;
      }

    /***************/

    // getter "gravedad"
      public double getGravedad(){
        return this.gravedad;
      }

    /***************/

    /**
      @name: "muestra"
      @info: muestra toda la información de la que se dispone sobre el astro
      @return: 
    */
      public abstract String muestra();
}