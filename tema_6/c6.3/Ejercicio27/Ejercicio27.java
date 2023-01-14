/*
  @author: Christian Millán Soria
  info: Ejercicio 27 - Tema 6
*/

package Ejercicio27;

import java.util.Scanner;

public class Ejercicio27{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);

    //Jugador
      System.out.print("Turno del jugador: ");
        String jugador=s.nextLine();
          jugador=jugador.toLowerCase();

      //Comprobación
        if((jugador.equals("piedra"))||(jugador.equals("papel"))||(jugador.equals("tijera"))){
          //Ordenador
            String ordenador="";

            switch((int)(Math.random()*3)){
              //Piedra
                case 0:
                  ordenador="piedra";
                break;

              //Papel
                case 1:
                  ordenador="papel";
                break;

              //Tijera
                case 2:
                  ordenador="tijera";
                break;
            }

            System.out.println("Turno del ordenador: "+ordenador);

          //Comprobación de quién ha ganado
            if(jugador.equals(ordenador)){
              System.out.print("Empate.");
            }else{
              int ganador=2;//El ordenador gana de forma predeterminada
              
              //Si se cumple lo siguiente gana el jugador
                switch(jugador){
                  //Piedra del jugador
                    case "piedra":
                      if(ordenador.equals("tijera")){
                        ganador=1;
                      }
                    break;

                  //Papel del jugador
                    case "papel":
                      if(ordenador.equals("piedra")){
                        ganador=1;
                      }
                    break;

                    //Tijera del jugador
                    case "tijera":
                      if(ordenador.equals("papel")){
                        ganador=1;
                      }
                    break;
                }

              //Impresión por pantalla
                if(ganador==1){
                  System.out.print("Gana el jugador.");
                }else{
                  System.out.print("Gana el ordenador.");
                }
            }
        }else{
          System.out.print("la jugada introducida no es correcta.");
        }

    //Cierre de Scanner
      s.close();
  }
}