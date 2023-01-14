/*
  @author: Christian Millán Soria
  info: Ejercicio 9 - Tema 6
*/

package Ejercicio9;

public class Ejercicio9{
  public static void main(String[] args){
    //Número que se muestra
      int num=0;

    //Total números
      int totalNums=0;

    //Generación de números pares
      while(num!=24){
        //Se generan números hasta el 50 y se multiplican por 2
          num=(int)(Math.random()*51)*2;

        //Impresión por pantalla
          System.out.println(num);

        //Incremento del total
          totalNums++;
      }

    //Resultado final
      System.out.print("Se han generado "+totalNums+" números.");
  }
}