/**
  @author: Christian Millán Soria
  @file: TestEj2Extra.java
  @info: programa principal
*/

package tema9.c93.ej2_extra;

import tema9.c93.ej2_extra.astros.Planetas;

import tema9.c93.ej2_extra.astros.Satelites;

public class TestEj2Extra{
  public static void main(String[] args){
    // creación de instancias
      // planetas
        Planetas[] arrayPlanetas=new Planetas[8];// los 8 planetas del sistema solar

        arrayPlanetas[0]=new Planetas(2439.7, 1408, 33011, 167, 3.7, "Mercurio", 57.91, 87.97);
        arrayPlanetas[1]=new Planetas(6051.8, 5832.5, 48675, 462, 8.87, "Venus", 108.2, 224.7);
        arrayPlanetas[2]=new Planetas(6371, 24, 5.972e24, 15, 9.81, "Tierra", 149.6, 365.24);
        arrayPlanetas[3]=new Planetas(3389.5, 24.6, 6.4171e23, -63, 3.71, "Marte", 227.9, 686.98);
        arrayPlanetas[4]=new Planetas(69911, 9.9, 1.8982e27, -108, 24.79, "Júpiter", 778.5, 4332.59);
        arrayPlanetas[5]=new Planetas(58232, 10.7, 5.6834e26, -139, 10.44, "Saturno", 1.4e9, 10759.22);
        arrayPlanetas[6]=new Planetas(25362, 17.2, 8.681e25, -197, 8.87, "Urano", 2.87e9, 30688.5);
        arrayPlanetas[7]=new Planetas(24622, 16.1, 1.0243e26, -201, 11.15, "Neptuno", 4.5e9, 60182);

      /*********************/

      // satélites
        Satelites[] arraySatelites=new Satelites[18];// 18 satélites de los más conocidos del sistema solar

        arraySatelites[0]=new Satelites(1737.5, 27.3, 7.342, -20, 1.62, "La Luna", 384.400, 27.3, arrayPlanetas[2]);
        arraySatelites[1]=new Satelites(11.1, 7.66, 1.08e+16, -40, 0.0084, "Fobos", 9378, 7.66, arrayPlanetas[3]);
        arraySatelites[2]=new Satelites();
        arraySatelites[3]=new Satelites();
        arraySatelites[4]=new Satelites();
        arraySatelites[5]=new Satelites();
        arraySatelites[6]=new Satelites();
        arraySatelites[7]=new Satelites();
        arraySatelites[8]=new Satelites();
        arraySatelites[9]=new Satelites();
        arraySatelites[10]=new Satelites();
        arraySatelites[11]=new Satelites();
        arraySatelites[12]=new Satelites();
        arraySatelites[13]=new Satelites();
        arraySatelites[14]=new Satelites();
        arraySatelites[15]=new Satelites();
        arraySatelites[16]=new Satelites();
        arraySatelites[17]=new Satelites();

    /*************************************************/

    // debug planetas
      for(int i=0; i<arrayPlanetas.length; i++){
        System.out.print(arrayPlanetas[i].muestra());
      }
    
    // debug satélites
      for(int i=0; i<arraySatelites.length; i++){
        System.out.print(arraySatelites[i].muestra());
      }
  }
}