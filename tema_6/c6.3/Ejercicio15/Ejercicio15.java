/*
  @author: Christian Millán Soria
  info: Ejercicio 15 - Tema 6
*/

package Ejercicio15;

public class Ejercicio15{
  public static void main(String[] args){
    //Variables necesarias
      int notas=4*(int)(Math.random()*7+1);
      String nota="";
      String primeraNota="";

    //Correspondencia de notas
      for(int contadorNota=1; contadorNota<=notas; contadorNota++){
        switch((int)(Math.random()*7)){
          //Do
            case 0:
              nota="do";
            break;
            
          //Re
            case 1:
              nota="re";
            break;

          //Mi
            case 2:
              nota="mi";
            break;

          //Fa
            case 3:
              nota="fa";
            break;

          //Sol
            case 4:
              nota="sol";
            break;

          //La
            case 5:
              nota="la";
            break;

          //Si
            case 6:
              nota="si";
            break;
        }

        //Si ha 1 única nota
          if(contadorNota==1){
            primeraNota=nota;
          }

        //Si el número de notas es igual
          if(contadorNota==notas){
            nota=primeraNota;
          }

        //Impresión de la nota
          System.out.print(nota+" ");

        //Número de barras
          if(contadorNota==notas){
            System.out.print("||");
          }else if(contadorNota%4==0){
            System.out.print("| ");
          }
      }
  }
}