/**
  @author: Christian Millán Soria
  @file: PruebaVehiculos.java
  @info: clase "PruebaVehiculos" - ejercicio 2
*/

package tema9.c91.ej2_poo;

import java.util.Scanner;

public class PruebaVehiculos{
  public static void main(String[] args){
    // variable para la opción
      int opcion=0;

    /********************************/

    // variable para los kilómetros
      int km;

    /********************************/

    // bicicleta nueva
      Bicicleta bici1=new Bicicleta(9);

    // coche nuevo
      Coche coche1=new Coche(1900);

    /********************************/

    // menú de opciones
      while(opcion!=8){
        System.out.println("\n1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");

        System.out.print("\nElige una opción (1-8): ");

        // scanner
          Scanner s=new Scanner(System.in);
            opcion=s.nextInt();

        System.out.println();

        /*************************/

        // switch
          switch(opcion){
            case 1:
              System.out.print("¿Cuántos kilómetros quieres recorrer? -> ");

              km=s.nextInt();

              bici1.recorre(km);
            break;

            /***************/

            case 2:
              bici1.hazCaballito();
            break;

            /***************/

            case 3:
              System.out.print("¿Cuántos kilómetros quieres recorrer? -> ");

              km=s.nextInt();

              coche1.recorre(km);
            break;

            /***************/

            case 4:
              coche1.quemaRueda();
            break;

            /***************/

            case 5:
              System.out.print("La bicicleta lleva recorridos ");

              System.out.println(bici1.getKmRecorridos()+" Km.");
            break;

            /***************/

            case 6:
              System.out.print("El coche lleva recorridos ");

              System.out.println(coche1.getKmRecorridos()+" Km.");
            break;

            /***************/

            case 7:
              System.out.print("Los vehículos llevan recorridos ");

              System.out.println(Vehiculo.getKmTotales()+" Km.");

            /***************/

            default:
        }
      }
  }
}