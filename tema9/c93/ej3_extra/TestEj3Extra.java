/**
  @author: Christian Millán Soria
  @file: TestEj3Extra.java
  @info: programa principal
*/

package tema9.c93.ej3_extra;

import tema9.c93.ej3_extra.cuentaBancaria.CuentaBancaria;

public class TestEj3Extra{
  public static void main(String[] args){
    CuentaBancaria cuenta1=new CuentaBancaria(500);

    System.out.println(cuenta1.getNumeroCuenta());
    System.out.println(cuenta1.getIban());
  }
}