/*
  @author: Christian Millán Soria
  info: Ejercicio 31 - Tema 6
*/

package Ejercicio31;

import java.util.Scanner;

public class Ejercicio31{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);
      
    //Dinero a apostar
      System.out.print("Dinero a apostar: ");
        int dinero=s.nextInt();
        
    //Dados
      int dado1=(int)(Math.random()*6+1);
      int dado2=(int)(Math.random()*6+1);
      
      int suma=dado1+dado2;

    //Impresión por pantalla
      System.out.println("Dado 1: "+dado1+".");
      System.out.println("Dado 2: "+dado2+".");
      System.out.println("suma: "+suma+".");
      
    //
      switch (suma) {
        //
          case 7, 11:
            System.out.println("¡Enhorabuena, has ganado otros "+dinero+" euros!");
            System.out.println("¡Ahora tienes "+dinero*2+" euros!");
          break;

        //
          case 2, 3, 12:
            System.out.println("Has perdido todo el dinero.");
          break;

        //Default
          default:
            System.out.println("Sigue tirando, tienes que conseguir el "+suma+" para ganar.");
            System.out.println("Si consigues un 7, pierdes la partida.");
            System.out.println("Pulsa INTRO para tirar los dados.");
              s.nextLine();
            
            boolean partidaTerminada=false;
            
            do{
              dado1=(int)(Math.random()*6+1);
              dado2=(int)(Math.random()*6+1);

              System.out.println("Dado 1: "+dado1+".");
              System.out.println("Dado 2: "+dado2+".");
              System.out.println("Suma: "+(dado1+dado2)+".");

              if((dado1+dado2)==suma){
                System.out.println("¡Enhorabuena, has ganado otros "+dinero+" euros!");
                System.out.println("¡Ahora tienes "+dinero*2+" euros!");
                
                partidaTerminada = true;
              }else if((dado1+dado2)==7){
                System.out.println("Lo siento, ha perdido todo su dinero ");

                partidaTerminada = true;
              }else{
                System.out.println("Sigue jugando.");
                System.out.println("Pulsa INTRO para tirar los dados.");
                  s.nextLine();
              }
            }while(!partidaTerminada);
  }

  //Cierre de Scanner
    s.close();
  }
}