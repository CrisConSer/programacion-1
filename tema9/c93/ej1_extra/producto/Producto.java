/**
  @author: Christian Millán Soria
  @file: Producto.java
  @info: clase "Producto" - ejercicio 1 extra
*/

package tema9.c93.ej1_extra.producto;

public class Producto{
  // atributos
    private String nombre;
    private int cantidad;

  /***********************************/

  // constructor
    public Producto(String nombre, int cantidad){
      this.nombre=nombre;

      this.cantidad=cantidad;
    }

  /***********************************/

  // métodos
    // getter del atributo "nombre"
      public String getNombre(){
        return nombre;
      }

    // setter del atributo "nombre"
      public void setNombre(String nombre){
        this.nombre=nombre;
      }

    /*************/

    // getter del atributo "cantidad"
      public int getCantidad(){
        return cantidad;
      }

    // setter del atributo "cantidad"
      public void setCantidad(int cantidad){
        this.cantidad=cantidad;
      }
}