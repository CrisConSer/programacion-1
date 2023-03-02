/**
  @author: Christian Millán Soria
  @file: TarjetaRegalo.java
  @info: clase "TarjetaRegalo" - ejercicio 11
*/

package tema9.c91.ej11_poo;

public class TarjetaRegalo{
  // atributos
    private double saldo;
    private int digitos;

  /****************************/

  // constructor
    public TarjetaRegalo(int s){
      this.saldo=s;

      this.digitos=(int)(Math.random()*(99999-10000+1)+10000);
    }

  /****************************/

  // métodos
    // getter para obtener los 5 dígitos de una tarjeta
      public int getDigitos(){
        return digitos;
      }

    /***************/

    /**
      @info: método para registrar un gasto en una tarjeta
      @param g: total a gastar
    */
      public void gasta(double g){
        if(g>this.saldo){// si el gasto es mayor que el saldo
          System.out.println("No tienes suficiente saldo para gastar "+String.format("%.2f", g)+"\u20AC");
        }else{
          this.saldo-=g;
        }
      }

    /***************/

    // getter para obtener el saldo
      public double getSaldo(){
        return saldo;
      }

    /***************/

    // método "toString"
      public String toString(){
        return "Tarjeta nº "+getDigitos()+" - Saldo "+String.format("%.2f", getSaldo())+"\u20AC";// el "String.format()" me permite mostrar el saldo con 2 decimales
      }
}