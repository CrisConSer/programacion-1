/**
  @author: Christian Millán Soria
  @file: TestEj2Extra.java
  @info: programa principal
*/

package tema9.c93.ej2_extra;

import tema9.c93.ej2_extra.astros.Planetas;

import tema9.c93.ej2_extra.astros.Satelites;

public class TestEj2Extra{
  public static void main(String[] args){
    Planetas planeta1=new Planetas(500, 500, 500, 500, 500, 500, 500, "si");

    System.out.print(planeta1.muestra());
  }
}