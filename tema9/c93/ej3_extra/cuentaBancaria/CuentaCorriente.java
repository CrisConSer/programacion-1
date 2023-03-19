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
      @name: calcularInteres
      @info: calcular interés de la cuenta
    */
    public void calcularInteres(){
      double intereses=getSaldo()*getInteresAnualBasico();

      anadir(intereses);
    }
}