/**
  @author: Christian Millán Soria
  @file: TestEj3Extra.java
  @info: programa principal
*/

package tema9.c93.ej3_extra;

import tema9.c93.ej3_extra.cuentaBancaria.CuentaBancaria;

import java.util.Scanner;

public class TestEj3Extra{
  public static void main(String[] args){
    // scanner
      Scanner input=new Scanner(System.in);
        int opcion;

    /*******************************************/

    // menú
      do{
        System.out.println("1. Listado");
        System.out.println("2. Mostrar información");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Retirar dinero");
        System.out.println("5. Traspasar dinero");
        System.out.println("6. Calcular el interés");
        System.out.println("7. Salir");

        System.out.print("Selecciona una opción: ");
          opcion=input.nextInt();
      }while(opcion!=7);
  }
}