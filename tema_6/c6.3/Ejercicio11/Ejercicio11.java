/*
  @author: Christian Millán Soria
  info: Ejercicio 11 - Tema 6
*/

package Ejercicio11;

public class Ejercicio11{
  public static void main(String[] args){
    //Variables necesarias
      int nota;

      int numSuspen=0;
      int numSuf=0;
      int numBien=0;
      int numNot=0;
      int numSobre=0;

    //Generación de notas aleatorias
      for(int i=0; i<20; i++){
        //Nota aleatoria
          nota=(int)(Math.random()*5);

          //Correspondencia
            switch(nota){
              //Suspenso
                case 0:
                  System.out.println("Suspenso.");

                  //Incremento de total
                    numSuspen++;
                break;

              //Suficiente
                case 1:
                  System.out.println("Suficiente.");

                  //Incremento de total
                    numSuf++;
                break;

              //Bien
                case 2:
                  System.out.println("Bien.");

                  //Incremento de total
                    numBien++;
                break;

              //Notable
                case 3:
                  System.out.println("Notable.");

                  //Incremento de total
                    numNot++;
                break;

              //Sobresaliente
                case 4:
                  System.out.println("Sobresaliente.");

                  //Incremento de total
                    numSobre++;
                break;
            }
      }

    //Número total de cada uno
    System.out.println("Se han generado un total de "+numSuspen+" suspensos.");
    System.out.println("Se han generado un total de "+numSuf+" suficientes.");
    System.out.println("Se han generado un total de "+numBien+" bien.");
    System.out.println("Se han generado un total de "+numNot+" notables.");
    System.out.print("Se han generado un total de "+numSobre+" sobresalientes.");
  }
}