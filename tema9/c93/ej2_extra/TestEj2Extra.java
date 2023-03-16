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
    // creación de instancias
      // planetas
        Planetas[] arrayPlanetas=new Planetas[8];

        arrayPlanetas[0]=new Planetas(2439.7, 1408, 33011, 167, 3.7, "Mercurio", 57.91, 87.97);
        arrayPlanetas[1]=new Planetas();
        arrayPlanetas[2]=new Planetas();
        arrayPlanetas[3]=new Planetas();
        arrayPlanetas[4]=new Planetas();
        arrayPlanetas[5]=new Planetas();
        arrayPlanetas[6]=new Planetas();
        arrayPlanetas[7]=new Planetas();
  }
}