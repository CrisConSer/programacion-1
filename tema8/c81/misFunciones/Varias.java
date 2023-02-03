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

  /***************************************************/

  /**
    @info: función para números primos
    @param x: número
    @return:
      - "true": el número es primo
      - "false": el número no es primo
  */
    public static boolean esPrimo(int x){
      // si es 1 o menor, no es primo
        if(x<=1){
          return false;
        }

      /********************/
    
      // comprobación de divisores
        for(int i=2; i<=x/2; i++){
          if(x%i==0){
            return false;
          }
        }

      /********************/

      // de forma predeterminada es "true"
        return true;
    }

  /***************************************************/

  /**
    @info: función para el siguiente número primo
    @param x: número
    @return num: variable que contiene el siguiente número primo
  */
    public static int siguientePrimo(int x){
      // siguiente número
        int num=x+1;

      /*********************/

      // bucle infinito
      while(true){
        // de forma predeterminada, el número es primo
          boolean primo=true;

        /**************/

        // comprobación de si es primo
          for(int i=2; i<=(num/2); i++){
            // si no es primo, se acaba el bucle "for" y se sigue ejecutando el bucle "while"
              if(num%i==0){
                primo=false;

                break;
              }
          }

        /**************/

        // si el número sacado del "for" es primo, se devuelve al "main"
          if(primo){
            return num;
          }

        /**************/

        // si no es primo, no se devuelve al "main" y se aumenta en 1 unidad
          num++;
      }
    }

  /***************************************************/

  /**
    @info: función para obtener la potencia
    @param:
      - "x": base
      - "y": exponente
    @return resultado: resultado de la potencia de la base y el exponente introducidos por teclado
  */
    public static int potencia(int x, int y){
      // variable acumulador
        int acu=1;

      /*************/

      // se realiza tantas veces como indica el exponente
        for(int i=0; i<y; i++){
          acu*=x;
        }

      /*************/

      // return
        return acu;
    }

  /***************************************************/

  /**
    @info: función para número de dígitos
    @param x: número
    @return numDigi: número de dígitos que tiene el número introducido
  */
    public static int digitos(int x){
      // variable para el total de dígitos
        int numDigi=0;

      /***************/

      // conteo
        // bucle
          while(x>0){
            x/=10;

            numDigi++;
          }

      /***************/

      /*
        alternativa: convertirlo a string y sacar su longitud:
          numDigi=String.valueOf(x).length();
      */

      /***************/

      // return
        return numDigi;
    }

  /***************************************************/

  /**
    @info: función para número invertido
    @param x: número
    @return rev: número invertido
  */
    public static int voltea(int x){
      // variable auxiliar
        int aux=x;

      /***************/

      // número invertido
        int rev=0;

      /***************/

      // volteo
        while(aux!=0){
          rev=rev*10+aux%10;
          aux/=10;
        }

      /***************/

      // return
        return rev;
    }

  /***************************************************/

  /**
    @info: función para calcular el perímetro de un rectángulo
    @param:
      - "ancho": ancho del rectángulo
      - "alto": alto del rectángulo
    @return perimetro: perímetro del rectángulo
  */
    public static double perimetroRectangulo(double ancho, double alto){
      // variable para el perímetro
        double perimetro=(ancho*=2)+(alto*=2);

      /***************/

      // return
        return perimetro;
    }

  /***************************************************/

  /**
    @info: función para calcular el área de un rectángulo
    @param:
      - "ancho": ancho del rectángulo
      - "alto": alto del rectángulo
    @return area: área del rectángulo
  */
    public static double areaRectangulo(double ancho, double alto){
      // variable para el perímetro
        double area=ancho*alto;

      /***************/

      // return
        return area;
    }
}