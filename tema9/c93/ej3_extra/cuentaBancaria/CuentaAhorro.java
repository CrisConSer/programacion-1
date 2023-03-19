/**
  @author: Christian Millán Soria
  @file: CuentaAhorro.java
  @info: subclase de "CuentaBancaria"
*/

package tema9.c93.ej3_extra.cuentaBancaria;

public class CuentaAhorro extends CuentaBancaria{
  // atributos
    private static final double saldoMinimo=1000.0;

  /**********************************************/

  // constructor
    public CuentaAhorro(double saldo){
      super(saldo);
    }

  /**********************************************/

  // métodos
    /**
      @name: calcularIntereses
      @info: calcular intereses de la cuenta
    */
      public void calcularIntereses() {
        if(getSaldo()>=saldoMinimo){
          double intereses=getSaldo()*(2*getInteresAnualBasico());
            anadir(intereses);
        }else{
          double intereses=getSaldo()*(0.5*getInteresAnualBasico());
            anadir(intereses);
        }
      }
}