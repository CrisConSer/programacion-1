/*
  @author: Christian Millán Soria
  info: Ejercicio 17 - Tema 6
*/

package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);

    //Obtención de la altura
      System.out.print("Introduce la altura de la pecera (4 mínimo): ");
        int altura=s.nextInt();

        //Comprobación
          if(altura<4){
            System.out.print("La altura introducida no es correcta.");
          }else{
            //Obtenciñon de la anchira
              System.out.print("Introduce la anchura de la pecera (4 mínimo): ");
                int anchura=s.nextInt();

                //Comprobación
                  if(anchura<4){
                    System.out.print("La anchura introducida no es correcta.");
                  }else{
                    //Posición del pez
                      int posicionPez=(int)(Math.random()*(altura-2)*(anchura-2));

                      int pos=0;

                      //Arriba
                        for(int i=0; i<anchura; i++){
                          System.out.print("*");
                        }

                        System.out.println();

                      //Centro
                        for(int i=2; i<altura; i++){
                          //Izquierda
                            System.out.print("*");

                          for(int j=2; j<anchura; j++){
                            if(pos==posicionPez){
                              System.out.print("@");
                            }else{
                              System.out.print(" ");
                            }

                            pos++;
                          }

                          //Derecha
                            System.out.println("*");
                        }

                      //Abajo
                        for(int i=0; i<anchura; i++){
                          System.out.print("*");
                        }
                  }
          }

    //Cierre de Scanner
      s.close();
  }
}