/**
  @author: Christian Millán Soria
  @file: Pizza.java
  @info: clase "Pizza" - ejercicio 5
*/

package tema9.c91.ej5_poo;

public class Pizza {
  // atributos
    private String tipo;
    private String tamano;
    private String estado;

  /************************************/

  // variables de clase
    private static int totalPedidas=0;
    private static int totalServidas=0;

  /************************************/

  // constructor
    public Pizza(String tipo, String tamano){
      // inicialización de los atributos
        this.tipo=tipo;
        this.tamano=tamano;
        this.estado="pedida";
    }

  /************************************/

  // métodos
    // servir
      public void sirve(){
        if(estado.equals("pedida")){
          estado="servida";

          totalServidas++;
        }else{
          System.out.println("esa pizza ya se ha servido");
        }
      }

    /*****************/

    // método "toString" - representa una pizza en una cadena
      public String toString(){
        return "pizza "+tipo+" "+tamano+", "+estado;
      }

    /*****************/

    // método "getTotalPedidas" - obtiene el número total de pizzas pedidas
      public static int getTotalPedidas(){
        return totalPedidas;
      }

    /*****************/

    // método "getTotalServidas" - obtiene el número total de pizzas servidas
      public static int getTotalServidas(){
        return totalServidas;
      }
}