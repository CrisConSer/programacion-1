/**
  @author: Christian Millán Soria
  @file: TestEj3Extra.java
  @info: programa principal
*/

package tema9.c93.ej3_extra;

import tema9.c93.ej3_extra.cuentaBancaria.CuentaAhorro;
import tema9.c93.ej3_extra.cuentaBancaria.CuentaBancaria;
import tema9.c93.ej3_extra.cuentaBancaria.CuentaCorriente;

import java.util.Scanner;

public class TestEj3Extra{
  public static void main(String[] args){
    // cuenta elegida
      int num;

    // dinero a ingresar/retirar/traspasar
      double dinero;

    /*************************************************************/

    // array de cuentas
      int t=4;

      CuentaBancaria[] cuentas=new CuentaBancaria[t];

      for(int i=0; i<t; i++){
        cuentas[i]=new CuentaCorriente(500+(int)(Math.random()*801+100));

        cuentas[i+=1]=new CuentaAhorro(500+(int)(Math.random()*801+100));
      }

    /*************************************************************/

    // scanner
      Scanner input=new Scanner(System.in);
        int opcion;

    /*************************************************************/

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

        /*******************************/

        switch(opcion){
          case 1:// listado
            for(int i=0; i<t; i++){
              System.out.println(cuentas[i].toString(i+1));
            }
          break;

          /*********************/

          case 2:// mostrar información
            System.out.print("Número de la cuenta sobre la que quieres obtener información: ");
              num=input.nextInt();

            System.out.println(cuentas[num-=1].informacionCuenta());
          break;

          /*********************/

          case 3:// ingresar dinero
            System.out.print("¿En qué cuenta quieres ingresar dinero? -> ");
              num=input.nextInt();

            System.out.print("¿Cuánto dinero quieres ingresar? -> ");
              dinero=input.nextDouble();

            cuentas[num-=1].ingresar(dinero);

            System.out.println("\nEl dinero ha sido ingresado. Puedes obtener la información de esta la cuenta número "+num+" en la opción número 2 del menú principal.\n");
          break;

          /*********************/

          case 4:// retirar dinero
            System.out.print("¿En qué cuenta quieres retirar dinero? -> ");
              num=input.nextInt();

            System.out.print("¿Cuánto dinero quieres retirar? -> ");
              dinero=input.nextDouble();

            cuentas[num-=1].retirar(dinero);

            System.out.println("\nEl dinero ha sido retirado. Puedes obtener la información de esta la cuenta número "+num+" en la opción número 2 del menú principal.\n");
          break;
        }
      }while(opcion!=7);
  }
}