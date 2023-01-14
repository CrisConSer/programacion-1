/*
  @author: Christian Millán Soria
  info: Ejercicio 19 - Tema 6
*/

package Ejercicio19;

public class Ejercicio19{
  public static void main(String[] args){
    //Variables necesarias
      int num;

      int maxPar=-100;
      int minImpar=200;

      int suma=0;

    //Generación de números
      for(int i=0; i<50; i++){
        num=(int)(Math.random()*301)-100;

        //Impresión por pantalla
          System.out.println(num);

        //Comprobación del máximo par y mínimo impar
          if(num%2==0){
            if(num>maxPar){
              maxPar=num;
            }else{
              if(num<minImpar){
                minImpar=num;
              }
            }
          }

        //Suma
          suma+=num;
      }

    //Impresión por pantalla
      System.out.print("El máximo número par es el "+maxPar+", el mínimo número impar es el "+minImpar+" y la media de todos los números da como resultado "+suma/50+".");
  }
}