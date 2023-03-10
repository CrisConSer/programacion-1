/**
  @author: Christian Millán Soria
  @file: TestEj3Arrays.java
  @info: programa principal del ejercicio 3 de arrays
*/

package tema9.c92.ej3_arrays;

import java.util.Scanner;

public class TestEj3Arrays{
  public static void main(String[] args){
    // array
      // tamaño
        final int t=100;

      /***************/

      // creación
        Disco[] discos=new Disco[t];

      /***************/

      // instancias de base
        for(int i=0; i<t; i++){
          discos[i]=new Disco();
        }

      /***************/

      // discos nuevos
        discos[0]=new Disco("R4T8K9", "The Electric Sunflowers", "Midnight in the Metropolis", "Synthwave", 4);
        discos[0]=new Disco("J6M9P2", "The Cosmic Wanderers", "Interstellar Dreams", "Space Rock", 5);
        discos[0]=new Disco("L8B3N6", "The Neon Nights", "City of Dreams", "Retrowave", 3);

    /*****************************************/

    // menú
      int opcion;
      Scanner input=new Scanner(System.in);
      String codigoIntroducido;
      String autorIntroducido;
      String tituloIntroducido;
      String generoIntroducido;
      int duracionIntroducida;

      /*********************/

      do{
        System.out.println("\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
          System.out.print("Introduce una opción: ");
            opcion=input.nextInt();

        /***********************/

        switch(opcion){
          case 1:
            System.out.println("LISTADO");
            System.out.println("=======");

            for(Disco d:discos){
              if(!d.getCodigo().equals("LIBRE")){
                System.out.println(d);
              }
            }
          break;

          case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");
          
          // Busca la primera posición libre del array
          int primeraLibre=-1;
            do{
              primeraLibre++;
            }while(!((discos[primeraLibre].getCodigo()).equals("LIBRE")));

              System.out.println("Por favor, introduzca los datos del disco.");
                System.out.print("Código: ");
                  codigoIntroducido=input.nextLine();
              
                System.out.print("Autor: ");
                  autorIntroducido=input.nextLine();
              
                System.out.print("Título: ");
                  tituloIntroducido=input.nextLine();
              
                System.out.print("Género: ");
                  generoIntroducido=input.nextLine();
              
                System.out.print("Duración: ");
                  duracionIntroducida=input.nextInt();
        
            /********************/
            
            discos[primeraLibre]=new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
          break;
        }
      }while(opcion!=5);
  }
}