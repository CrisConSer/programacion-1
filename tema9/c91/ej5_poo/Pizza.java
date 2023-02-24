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

  // métodos
    public Pizza(String tipo, String tamano){
      this.tipo=tipo;
      this.tamano=tamano;
      this.estado="pedida";
    }

    public void sirve(){
      if(estado.equals("pedida")){
        estado="servida";
        totalServidas++;
      }else{
        System.out.println("esa pizza ya se ha servido");
      }
    }

    public String toString(){
      return "pizza "+tipo+" "+tamano+", "+estado;
    }

    public static int getTotalPedidas(){
      return totalPedidas;
    }

    public static int getTotalServidas(){
      return totalServidas;
    }

  // variables de clase
    private static int totalPedidas=0;
    private static int totalServidas=0;
}