/*
  @author: Christian Millán Soria
  info: ejercicio 18 bidimensionales
*/

package tema7.c72.ej18_bidi;

public class Ej18{
  public static void main(String[] args){
    // mayores y menores que 100
      int mitad=10;

      int[] mayores=new int[mitad];
      int[] menores=new int[mitad];

      int mayoresCont=0;
      int menoresCont=0;

    /*************************************/

    // creación del array
      // número de elementos
        int t=10;

      // creación
        int[] array=new int[t];

    /*************************************/

    // asignación de valores aleatorios entre 0-100
      for(int i=0; i<t; i++){
        array[i]=(int)(Math.random()*201);

        // mayores que 100
          if(array[i]>100){
            mayores[i]=array[i];

            mayoresCont++;
          }

        // menores que 100
          if(array[i]<100){
            menores[i]=array[i];

            menoresCont++;
        }
      }

    /*************************************/

    // índice
      int indice=0;

    /*************************************/

    // array original
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Indice ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", indice);

        indice++;
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Valor  ");

      // array original
        for(int i=0; i<10; i++){
          System.out.printf("| %-3d ", array[i]);
        }

        System.out.println("|");
        System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        System.out.println();
        System.out.println();
        System.out.println();

    /*************************************/

    // reordenamiento
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Indice ");

      for(int i=0; i<10; i++){
        System.out.printf("| %-3d ", indice);

        indice++;
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
      System.out.print("| Valor  ");

      for(int i=0; i<t; i++){
        while(mayoresCont>0&&menoresCont>0){
          System.out.printf("| %-3d ", menores[i]);

          System.out.printf("| %-3d ", mayores[i]);

          mayoresCont--;

          menoresCont--;
        }

        System.out.printf("| %-3d ", array[i]);
      }

      System.out.println("|");
      System.out.println("+--------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
  }
}