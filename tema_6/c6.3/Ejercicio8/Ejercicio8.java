package Ejercicio8;
/*
  @author: Christian Millán Soria
  info: Ejercicio 8 - Tema 6
*/

public class Ejercicio8{
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
            result=(int)(Math.random()*6)+1;

            //Distintos resultados
              switch(result){
                //1, 2 y 3
                  case 1, 2, 3:
                    System.out.print(" 1 |");
                  break;

                //4 y 5
                  case 4, 5:
                    System.out.print(" X |");
                  break;

                //6
                  case 6:
                    System.out.print(" 2 |");
                  break;
              }
          }

      System.out.println();
      }
  }
}