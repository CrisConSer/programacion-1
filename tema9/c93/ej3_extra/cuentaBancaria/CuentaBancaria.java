/**
  @author: Christian Millán Soria
  @file: CuentaBancaria.java
  @info: clase abstracta "CuentaBancaria"
*/

package tema9.c93.ej3_extra.cuentaBancaria;

public abstract class CuentaBancaria{
  // atributos
    private String iban;
    private double saldo;

  /****************************************************/

  // constructor
    public CuentaBancaria(String iban, double saldo){
      this.iban=iban;
      this.saldo=saldo;
    }

  /****************************************************/

  // métodos
    // getter "iba"
      public String getIbban(){
        return this.iban;
      }

    /********************/

    // getter "saldo"
      public double getSaldo(){
        return this.saldo;
      }

    /********************/

    /**
      @name: ingresar
      @info: aumentar el valor del atributo "saldo"
      @param double saldo: valor a sumar al saldo actual
    */
      public void ingresar(double saldo){
        this.saldo+=saldo;
      }

    /********************/

    /**
      @name: retirar
      @info: disminuir el valor del atributo "saldo"
      @param double saldo: valor a restar al saldo actual
    */
      public void retirar(double saldo){
        this.saldo-=saldo;
      }
}