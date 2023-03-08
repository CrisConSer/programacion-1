/**
  @author: Christian Millán Soria
  @file: Disco.java
  @info: clase "Disco" - ejercicio 3 de arrays
*/

package tema9.c92.ej3_arrays;

public class Disco{
  // atributos
    private String codigo="LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;// en minutos

  /*****************************************/

  // constructor
    public Disco(String c, String a, String t, String g, int d){
      // código
        this.codigo=c;

      /****************/

      // autor
        this.autor=a;

      /****************/

      // título
        this.titulo=t;

      /****************/

      // género
        this.genero=g;

      /****************/

      // duración
        this.duracion=d;
    }

  /*****************************************/

  // métodos
    
}