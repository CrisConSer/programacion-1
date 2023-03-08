/**
  @author: Christian Millán Soria
  @file: Gato.java
  @info: clase "Gato" - ejercicio 1 de arrays
*/

package tema9.c92.ej1_arrays;

public class Gato{
  // atributo
    private String sexo;

  /******************************************/

  // constructor
    public Gato(String s){
      this.sexo=s.toLowerCase();
    }

  /******************************************/

  // métodos
    // getter para el atributo "sexo"
      public String getSexo(){
        return this.sexo;
      }

    /***********************/

    // método para mostrar la información del gato
      public String toString(int numeroGato){
        String info="Gato "+numeroGato+" -> "+this.sexo+".";

        return info;
      }

    /***********************/

    // método para hacer que el gato maulle
      public String maulla(){
        String miau="Miau";

        return miau;
      }

    /***********************/

    // método para hacer que el gato ronronee
      public String ronronea(){
        String mrrr="Mrrr";

        return mrrr;
      }

    /***********************/

    /**
      @info: método para hacer que el gato coma - si no se le da pescado, lo rechaza
      @param comida: comida que se le ofrece al gato
    */
      public void comer(String comida){
        comida=comida.toLowerCase();

        if(comida.equals("pescado")){
          System.out.print("Hmmm, gracias.");
        }else{
          System.out.print("Lo siento, solo como pescado.");
        }
      }

    /***********************/

    /**
      @info: método para hacer pelear a dos gatos entre si - solo se pelean los machos entre si
      @param contrincante: gato contra el que pelea el primer gato
    */
      public void peleaCon(Gato contrincante){
        if(this.sexo.equals("hembra")){
          System.out.print("No me gusta pelear.");
        }else{
          if(contrincante.getSexo().equals("hembra")){
            System.out.print("No peleo contra gatitas.");
          }else{
            System.out.print("Ven aquí que te vas a enterar.");
          }
        }
      }
}