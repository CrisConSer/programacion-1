/**
  @author: Christian Millán Soria
  @file: GatoSimple.java
  @info: ejemplo 1 - gato simple
*/

package tema9.ejemplos.gato;

public class GatoSimple{
  // atributos
    String color, raza, sexo;

    int edad;

    double peso;

  /************************************************/

  // métodos
    // constructor
      GatoSimple(String s){
        this.sexo=s;
      }

    // getter
      String getSexo(){
        return this.sexo;
      }

  /************************************************/

  // gato maulla
    void maulla(){
      System.out.print("Miau");
    }

  // gato ronronea
    void ronronea(){
      System.out.print("Mrrr");
    }

  /************************************************/

  /**
    @info: gato come - si no se le da pescado, la rechaza
    @param comida: comida que se le ofrece al gato
  */
    void come(String comida){
      comida=comida.toLowerCase();

      if(comida.equals("pescado")){
        System.out.print("Hmmm, gracias");
      }else{
        System.out.print("Lo siento, solo como pescado");
      }
    }

  /************************************************/

  /**
    @info: pelea de gatos - solo se pelean los machos entre si (¿?)
    @param contrincante: gato contra el que pelea el primer gato
  */
    void peleaCon(GatoSimple contrincante){
      contrincante=contrincante.toLowerCase();

      if(this.sexo.equals("hembra")){
        System.out.print("No me gusta pelear");
      }else{
        if(contrincante.getSexo().equals("hembra")){
          System.out.print("No peleo contra gatitas");
        }else{
          System.out.print("Ven aquí que te vas a enterar");
        }
      }
    }
}