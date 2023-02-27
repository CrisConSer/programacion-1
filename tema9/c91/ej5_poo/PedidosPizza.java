/**
  @author: Christian Millán Soria
  @file: PedidosPizza.java
  @info: clase "PedidosPizza" - ejercicio 5
*/

package tema9.c91.ej5_poo;

public class PedidosPizza{
  public static void main(String[] args){
    // creación de 3 instancias
      Pizza pizza1=new Pizza("margarita", "mediana");

      Pizza pizza2=new Pizza("funghi", "familiar");
      pizza2.sirve();

      Pizza pizza3=new Pizza("cuatro quesos", "mediana");

    /***************************************/

    // información sobre las 3 pizzas creadas
      System.out.println(pizza1);
      System.out.println(pizza2);
      System.out.println(pizza3);

    /***************************************/

    // aunque se "sirva" "pizza2" de nuevo, su estado no cambia y el contador de pizzas servidas tampoco, porque es la misma pizza
      pizza2.sirve();

    /***************************************/

    // total de pizzas pedidas y servidas
      System.out.println("pedidas: "+Pizza.getTotalPedidas());
      System.out.println("servidas: "+Pizza.getTotalServidas());
  }
}