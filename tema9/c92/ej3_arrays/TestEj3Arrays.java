/**
  @author: Christian Millán Soria
  @file: TestEj3Arrays.java
  @info: programa principal del ejercicio 3 de arrays
*/

package tema9.c92.ej3_arrays;

public class TestEj3Arrays{
  public static void main(String[] args){
    // array
      // tamaño
        final int t=100;

      /***************/

      // creación
        Disco[] discos=new Disco[t];

      /***************/

      // instancias
        for(int i=0; i<t; i++){
          discos[i]=new Disco();
        }
  }
}