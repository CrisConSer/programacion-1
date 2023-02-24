/**
  @author: Christian Millán Soria
  @file: PedidosPizza.java
  @info: clase "PedidosPizza" - ejercicio 5
*/

package tema9.c91.ej5_poo;

public class PedidosPizza {
  public static void main(String[] args) {
    // interacciones
      Pizza pizza1=new Pizza("margarita", "mediana");
      Pizza pizza2=new Pizza("4 quesos", "familiar");
      pizza2.sirve();
      Pizza p3=new Pizza("cuatro quesos", "mediana");
      System.out.println(pizza1);
      System.out.println(pizza2);
      System.out.println(p3);
      pizza2.sirve();
      System.out.println("pedidas: "+Pizza.getTotalPedidas());
      System.out.println("servidas: "+Pizza.getTotalServidas());
  }
}