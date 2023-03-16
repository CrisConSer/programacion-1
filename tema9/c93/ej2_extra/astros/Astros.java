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

  // métodos
    /**
      @name: "muestra"
      @info: muestra toda la información de la que se dispone sobre el astro
      @return: 
    */
      public String muestra(){
        String info="--------------------------";
          info+="- Radio Ecuatorial: "+this.radioEcuatorial;
          info+="- Rotación sobre su eje: "+this.rotacionSobreSuEje;
          info+="- Masa: "+this.masa;
          info+="Temperatura media: "+this.temperaturaMedia;
          info+="Gravedad: "+this.gravedad;

        return info;
      }
}