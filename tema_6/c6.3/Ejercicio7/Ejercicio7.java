package Ejercicio7;
/*
  @author: Christian Millán Soria
  info: Ejercicio 7 - Tema 6
*/

public class Ejercicio7{
  public static void main(String[] args){
    //Columna, fila, apuesta y resultado
      int column=3;

      int fila;

      int apuesta;

      int result;

    //For loop
      for(fila=1; fila<=15; fila++){
        //Impresión por pantalla
          System.out.printf("%4d. |", fila);

        //Comprobación de la fila
          if(fila==15){
            column=1;
          }

          //Apuesta
            for(apuesta=1; apuesta<=column; apuesta++){
              result=(int)(Math.random()*3)+1;

              //Distintos resultados
                switch(result){
                  //1
                    case 1:
                      System.out.print(" 1 |");
                    break;

                  //2
                    case 2:
                      System.out.print(" 2 |");
                    break;

                  //3
                    case 3:
                      System.out.print(" X |");
                }
            }

      System.out.println();
      }
  }
}