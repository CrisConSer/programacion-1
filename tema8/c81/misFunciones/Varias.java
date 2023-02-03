package tema8.c81.misFunciones;

public class Varias{
  /**
    @info: función para realizar la multiplicación de 2 números
    @param:
      - "a": primer número
      - "b": segundo número
    @return result: resultado de la multiplicación
  */
    public static double multiplica(double a, double b){
      return a*b;

      /*
        otra forma de hacerlo es almacenar el resultado en una variable:
          // resultado
            double result=a*b;

          // return
            return result;
      */
    }

  /***************************************************/

  /**
    @info: función para sacar el menor de entre dos valores
    @param:
      - "a": primer número
      - "b": segundo número
    @return:
      - "a": el primer número es el menor
      - "b": el segundo número es el menor
  */
    public static int minimo(int a, int b){
      if(a<b){
        return a;
      }else{
        return b;
      }
    }
}