/**
  @author: Christian Millán Soria
  @file: Gestisimal.java
  @info: clase "Gestisimal" - ejercicio 5 de arrays
*/

package tema9.c92.ej5_arrays;

public class Gestisimal{
  // atributos
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private static int stock=0;

  /*********************************/

  // constructor
    public Gestisimal(String d, double pC, double pV){
      // generación de código aleatorio
        this.codigo="";
          for(int i=0; i<10; i++){
            this.codigo+=(int)(Math.random()*10);
          }

      /******************/

      // descripción
        this.descripcion=d;

      /******************/

      // precio de compra
        this.precioCompra=pC;

      /******************/

      // precio de venta
        this.precioVenta=pV;

      /******************/

      // stock
        Gestisimal.stock++;
    }

  /*********************************/

  // métodos
    // método para listar todos los productos
      public static void listado(){
        
      }
}