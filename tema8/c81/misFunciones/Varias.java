package tema8.c81.misFunciones;

public class Varias{
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

      // número invertido
        int rev=0;

      // volteo
        while(aux!=0) {
            rev=rev*10+aux%10;
            aux/=10;
        }        

      // comprobación
        if(x==rev){
          return true;
        }else{
          return false;
        }
    }
}