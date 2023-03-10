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
        discos[1]=new Disco("J6M9P2", "The Cosmic Wanderers", "Interstellar Dreams", "Space Rock", 5);
        discos[2]=new Disco("L8B3N6", "The Neon Nights", "City of Dreams", "Retrowave", 3);

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
            
            // busca la primera posición libre del array
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

            // creación de la instancia con los datos introducidos
              discos[primeraLibre]=new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
          break;

          case 3:
            System.out.println("\nMODIFICAR");
            System.out.println("===========");

            System.out.print("Introduce el código del disco cuyos datos desea cambiar: ");
              codigoIntroducido=input.nextLine();

            int i=-1;
              do{
                i++;
              }while(!((discos[i].getCodigo()).equals(codigoIntroducido)));

            System.out.println("Introduce los nuevos datos del disco o INTRO para dejarlos igual.");

            System.out.println("Código: "+discos[i].getCodigo());
            System.out.print("Nuevo código: ");
              codigoIntroducido=input.nextLine();
                if(!codigoIntroducido.equals("")){
                  discos[i].setCodigo(codigoIntroducido);
                }

            System.out.println("Autor: "+discos[i].getAutor());
            System.out.print("Nuevo autor: ");
              autorIntroducido=input.nextLine();
                if(!autorIntroducido.equals("")){
                  discos[i].setAutor(autorIntroducido);
                }

            System.out.println("Título: "+discos[i].getTitulo());
            System.out.print("Nuevo título: ");
              tituloIntroducido=input.nextLine();
                if(!tituloIntroducido.equals("")){
                  discos[i].setTitulo(tituloIntroducido);
                }

            System.out.println("Género: "+discos[i].getGenero());
            System.out.print("Nuevo género: ");
              generoIntroducido=input.nextLine();
                if(!generoIntroducido.equals("")){
                  discos[i].setGenero(generoIntroducido);
                }

            System.out.println("Duración: "+discos[i].getDuracion());
            System.out.print("Duración: ");
              final String duracionIntroducidaString=input.nextLine();
                if(!duracionIntroducidaString.equals("")){
                  discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
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
              }while(!((discos[i].getCodigo()).equals(codigoIntroducido)));

            discos[i].setCodigo("LIBRE");
              System.out.println("Album borrado.");
          break;
        }
      }while(opcion!=5);
  }
}