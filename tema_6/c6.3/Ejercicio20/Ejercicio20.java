/*
  @author: Christian Millán Soria
  info: Ejercicio 20 - Tema 6
*/

package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);

    //Obtención de la capacidad de la cuba
      System.out.print("Introduce la capacidad de la cuba: ");
        int capa=s.nextInt();

    //Generación de una cantidad de agua sin pasarse de la capacidad introducida
      int cantidad=(int)(Math.random()*(capa+1));

      for(int i=0; i<capa; i++){
        if(i<(capa-cantidad)){
          System.out.println("#     #");
        }else{
          System.out.println("#~~~~~#");
        }
      }

    //Base
      System.out.println("#######");

    //Datos
      System.out.print("La cuba tiene una capacidad de "+capa+" litros y contiene "+cantidad+" litros de agua.");

    //Cierre de Scanner
      s.close();
  }
}