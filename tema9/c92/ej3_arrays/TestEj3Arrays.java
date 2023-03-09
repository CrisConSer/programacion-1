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

      // instancias de base
        for(int i=0; i<t; i++){
          discos[i]=new Disco();
        }

      /***************/

      // discos nuevos
        discos[0]=new Disco("R4T8K9", "The Electric Sunflowers", "Midnight in the Metropolis", "Synthwave", 4);
        discos[0]=new Disco("J6M9P2", "The Cosmic Wanderers", "Interstellar Dreams", "Space Rock", 5);
        discos[0]=new Disco("L8B3N6", "The Neon Nights", "City of Dreams", "Retrowave", 3);
  }
}