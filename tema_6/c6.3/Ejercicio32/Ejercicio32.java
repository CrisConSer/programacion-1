/*
  @author: Christian Millán Soria
  info: Ejercicio 32 - Tema 6
*/

package Ejercicio32;

import java.util.Scanner;

public class Ejercicio32{
  public static void main(String[] args){
    //Scanner
      Scanner s=new Scanner(System.in);

    //Obtención de la longitud
      System.out.print("Introduce la longitud del sendero: ");
      int longitud=s.nextInt();

    //Espacios
      int espaciosDelante=6;

      for(int i=0; i<longitud; i++){
        //Espacios por delante
        for(int j=0; j<espaciosDelante; j++) {
          System.out.print(' ');
        }

        //Borde izquierdo
          System.out.print('|');

        //Interior
          int posicionObstaculo=-1;
          
          char obstaculo='*';
          
          if((int)(Math.random()*2)==0){
            posicionObstaculo=(int)(Math.random()*4);
            
            if((int)(Math.random()*2)==0){
              obstaculo='O';
            }
          }
          
          for(int j=0; j<4; j++){
            System.out.print(j==posicionObstaculo?obstaculo:' ');
          }
        
        //Borde derecho
          System.out.println('|');
          
          espaciosDelante+=(int)(Math.random()*3)-1;
      }

    //Cierre de Scanner
      s.close();
  }
}