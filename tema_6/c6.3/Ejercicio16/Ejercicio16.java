/*
  @author: Christian Millán Soria
  info: Ejercicio 16 - Tema 6
*/

package Ejercicio16;

public class Ejercicio16{
  public static void main(String[] args){
    //VAriables para las figuras
      //Figura generada aleatoriamente
        int figura;

      //Figuras por posición
        int pos1=0;
        int pos2=0;
        int pos3=0;

    //For loop
      for(int i=1; i<=3; i++){
        //Generación de figura aleatoria
          figura=(int)(Math.random()*5);

          //Correspondencia
            switch(figura){
              //Corazón
                case 0:
                  System.out.println("Corazón.");
                break;

              //Diamante
                case 1:
                  System.out.println("Diamante.");
                break;

              //Herradura
                case 2:
                  System.out.println("Herradura.");
                break;

              //Campana
                case 3:
                  System.out.println("Campana.");
                break;

              //Limón
                case 4:
                  System.out.println("Limón.");
                break;
            }

        //Asignación de la figura generada a cada posición
            switch(i){
              //Posición 1
                case 1:
                  pos1=figura;
                break;

              //Posición 2
                case 2:
                  pos2=figura;
                break;

              //Posición 3
                case 3:
                  pos3=figura;
                break;
            }
      }

    //Impresión por pantalla de acuerdo con el caso
      if((pos1!=pos2)&&(pos2!=pos3)&&(pos1!=pos3)){
        System.out.print("Lo siento, ha perdido.");
      }else if((pos1==pos2)&&(pos2==pos3)){
        System.out.print("Enhorabuena, ha ganado 10 monedas.");
      }else{
        System.out.print("Bien, ha recuperado su moneda.");
      }
  }
}