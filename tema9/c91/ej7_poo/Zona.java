/**
  @author: Christian Millán Soria
  @file: Zona.java
  @info: clase "Zona" - ejercicio 7
*/

package tema9.c91.ej7_poo;

public class Zona{
  // atributos
    private int entradasPorVender;

  /*****************************************/

  // constructor
    public Zona(int n){
      entradasPorVender=n;
    }

  /*****************************************/

  // métodos
    // método para obtener el número de entradas por vender
      public int getEntradasPorVender(){
        return entradasPorVender;
      }

    /******************/

    // método para vender un número de entradas (comprueba si quedan entradas libres antes de realizar la venta)
      public void vender(int n){
        if(this.entradasPorVender==0){
          System.out.print("Lo siento, las entradas para esa zona están agotadas.");
        }else if(this.entradasPorVender<n){
          System.out.print("Sólo quedan "+this.entradasPorVender+" entradas para esa zona.");
        }

        if(this.entradasPorVender>=n){
          entradasPorVender-=n;// eliminación de las entradas que se van a vender

          System.out.print("Aquí tienes tus "+n+" entradas, gracias.");
        }
      }
}