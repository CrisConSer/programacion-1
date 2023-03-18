/**
  @author: Christian Millán Soria
  @file: CuentaBancaria.java
  @info: clase abstracta "CuentaBancaria"
*/

package tema9.c93.ej3_extra.cuentaBancaria;

public class CuentaBancaria{
  // atributos
    private String numeroCuenta="";
    private String iban="";
    private double saldo;

  /****************************************************/

  // constructor
    public CuentaBancaria(double saldo){
      // número de cuenta
        for(int i=0; i<4; i++){
          for(int j=0; j<4; j++){
            this.numeroCuenta+=(int)(Math.random()*10);
          }

          this.numeroCuenta+=" ";
        }

      /***********************/

      // iban
        String codigoPais="ES";
        String codigoControl=String.format("%02d", (int)(Math.random()*100));// código de control aleatorio de dos dígitos

        // eliminar espacios de la cadena de número de cuenta y dividirla en bloques de 4 caracteres
          String cuentaConEspacios=this.numeroCuenta.replace(" ", "").replaceAll("(.{4})", "$1 ").trim();

        this.iban=codigoPais+codigoControl+" "+cuentaConEspacios;

      /***********************/

      // saldo
        this.saldo=saldo;
    }

  /****************************************************/

  // métodos
    // getter "iba"
    public String getNumeroCuenta(){
      return this.numeroCuenta;
    }

    /********************/

    // getter "iban"
      public String getIban(){
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