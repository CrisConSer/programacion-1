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
        Disco[] album=new Disco[t];

      /***************/

      // instancias de base
        for(int i=0; i<t; i++){
          album[i]=new Disco();
        }

      /***************/

      // discos nuevos
        album[0]=new Disco("R4T8K9", "The Electric Sunflowers", "Midnight in the Metropolis", "Synthwave", 4);
        album[1]=new Disco("J6M9P2", "The Cosmic Wanderers", "Interstellar Dreams", "Space Rock", 5);
        album[2]=new Disco("L8B3N6", "The Neon Nights", "City of Dreams", "Retrowave", 3);

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

            for(Disco d:album){
              if(!d.getCodigo().equals("LIBRE")){
                System.out.println(d);
              }
            }
          break;

          case 2:
            System.out.println("\nNUEVO DISCO");
            System.out.println("===========");
            
            // busca la primera posición libre del array
              int primeraLibre=-1;
                do{
                  primeraLibre++;
                }while(!((album[primeraLibre].getCodigo()).equals("LIBRE")));

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

            // creación de la instancia con los datos introducidos
              album[primeraLibre]=new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
          break;

          case 3:
            System.out.println("\nMODIFICAR");
            System.out.println("===========");

            System.out.print("Introduce el código del disco cuyos datos desea cambiar: ");
              codigoIntroducido=input.nextLine();

            int i=-1;
              do{
                i++;
              }while(!((album[i].getCodigo()).equals(codigoIntroducido)));

            System.out.println("Introduce los nuevos datos del disco o INTRO para dejarlos igual.");

            System.out.println("Código: "+album[i].getCodigo());
            System.out.print("Nuevo código: ");
              codigoIntroducido=input.nextLine();
                if(!codigoIntroducido.equals("")){
                  album[i].setCodigo(codigoIntroducido);
                }

            System.out.println("Autor: "+album[i].getAutor());
            System.out.print("Nuevo autor: ");
              autorIntroducido=input.nextLine();
                if(!autorIntroducido.equals("")){
                  album[i].setAutor(autorIntroducido);
                }

            System.out.println("Título: "+album[i].getTitulo());
            System.out.print("Nuevo título: ");
              tituloIntroducido=input.nextLine();
                if(!tituloIntroducido.equals("")){
                  album[i].setTitulo(tituloIntroducido);
                }

            System.out.println("Género: "+album[i].getGenero());
            System.out.print("Nuevo género: ");
              generoIntroducido=input.nextLine();
                if(!generoIntroducido.equals("")){
                  album[i].setGenero(generoIntroducido);
                }

            System.out.println("Duración: "+album[i].getDuracion());
            System.out.print("Duración: ");
              final String duracionIntroducidaString=input.nextLine();
                if(!duracionIntroducidaString.equals("")){
                  album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                }
          break;

          case 4:
            System.out.println("\nBORRAR");
            System.out.println("======");

            System.out.print("Introduce el código del disco que desea borrar: ");
              codigoIntroducido=input.nextLine();

            i=-1;
              do{
                i++;
              }while(!((album[i].getCodigo()).equals(codigoIntroducido)));

            album[i].setCodigo("LIBRE");
              System.out.println("Album borrado.");
          break;
        }
      }while(opcion!=5);
  }
}