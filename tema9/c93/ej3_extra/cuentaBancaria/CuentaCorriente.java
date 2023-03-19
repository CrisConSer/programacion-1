/**
  @author: Christian Millán Soria
  @file: CuentaCorriente.java
  @info: subclase de "CuentaBancaria"
*/

package tema9.c93.ej3_extra.cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria{
  // constructor
    public CuentaCorriente(double saldo){
      super(saldo);
    }

  /***************************************/

  // métodos
    /**
      @name: calcularIntereses
      @info: calcular interés de la cuenta
    */
    public void calcularIntereses(){
      double intereses=getSaldo()*getInteresAnualBasico();

      anadir(intereses);
    }
}