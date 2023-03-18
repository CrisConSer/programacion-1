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
}