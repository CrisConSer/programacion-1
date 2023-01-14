/*
  @author: Christian Millán Soria
  info: Ejercicio 21 - Tema 6
*/

package Ejercicio21;

public class Ejercicio21{
  public static void main(String[] args){
    //Moneda
      String moneda="";

    //Cara generada
      String cara="";

      //Correspondencia
        for(int i=0; i<5; i++){
          //Moneda
            switch((int)(Math.random()*8)){
              //1 céntimo
                case 0:
                  moneda="1 céntimo";
                break;

              //2 céntimos
                case 1:
                  moneda="2 céntimos";
                break;

              //5 céntimos
                case 2:
                  moneda="5 céntimos";
                break;

              //10 céntimos
                case 3:
                  moneda="10 céntimos";
                break;

              //20 céntimos
                case 4:
                  moneda="20 céntimos";
                break;

              //50 céntimos
                case 5:
                  moneda="50 céntimos";
                break;

              //1 euro
                case 6:
                  moneda="1 euro";
                break;

              //2 euros
                case 7:
                  moneda="2 euros";
                break;
            }

          //Cara
            switch((int)(Math.random()*2)){
              //Cara
                case 0:
                  cara="cara";
                break;

              //Cruz
                case 1:
                  cara="cruz";
                break;
            }

          //Muestra de cada tirada
            System.out.println("Se ha lanzado una moneda de "+moneda+" y ha salido "+cara+".");
        }
  }
}