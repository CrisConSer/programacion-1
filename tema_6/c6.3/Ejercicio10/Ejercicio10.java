/*
  @author: Christian Millán Soria
  info: Ejercicio 10 - Tema 6
*/

package Ejercicio10;

public class Ejercicio10{
  public static void main(String[] args){
    //Caracter y longitud de la línea
      int numCaracter;
      String caracter="";

      int longitud;

    //Bucle para las 10 líneas
      for(int i=1; i<=10; i++){
        //Generación del caracter
          numCaracter=(int)(Math.random()*6);

          //Correspondencia
            switch(numCaracter){
              //"*"
                case 0:
                  caracter="*";
                break;

              //"-"
                case 1:
                  caracter="-";
                break;

              //"="
                case 2:
                  caracter="=";
                break;

              //"."
                case 3:
                  caracter=".";
                break;

              //"|"
                case 4:
                  caracter="|";
                break;

              //"@"
                case 5:
                  caracter="@";
                break;
            }

        //Longitud aleatoria
          longitud=(int)(Math.random()*40)+1;

        //Impresión por pantalla
          for(int j=1; j<=longitud; j++){
            System.out.print(caracter);
          }

        System.out.println();
      }
  }
}