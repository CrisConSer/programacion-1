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

  /***************************************************/

  /**
    @info: función para averiguar el signo de un número
    @param a: primer número
    @return signo:
      - "-1": el número es negativo
      - "0": el número es igual a 0
      - "1": el número es positivo
  */
    public static int dimeSigno(int a){
      // variable para el signo
        int signo;

      /******************/

      // comprobación
        if(a<0){
          signo=-1;
        }else if(a==0){
          signo=0;
        }else{
          signo=1;
        }

      /******************/

      // return
        return signo;
    }

  /***************************************************/

  /**
    @info: función para números capicúa
    @param x: número
    @return:
      - "true": el número es capicúa
      - "false": el número no es capicúa
  */
    public static boolean esCapicua(int x){
      // variable auxiliar
        int aux=x;

      /****************/

      // número invertido
        int rev=0;

      /****************/

      // volteo
        while(aux!=0) {
            rev=rev*10+aux%10;
            aux/=10;
        }

      /****************/

      // comprobación
        if(x==rev){
          return true;
        }else{
          return false;
        }
    }
}