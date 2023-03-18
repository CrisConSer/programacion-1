/**
  @author: Christian Millán Soria
  @file: CuentaBancaria.java
  @info: clase abstracta "CuentaBancaria"
*/

package tema9.c93.ej3_extra.cuentaBancaria;

public abstract class CuentaBancaria{
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
        this.iban+="ES";

        for(int i=0; i<2; i++){
          this.iban+=(int)(Math.random()*10);
        }

        this.iban+=" ";

        for(int i=0; i<4; i++){
          for(int j=0; j<4; j++){
            this.iban+=(int)(Math.random()*10);
          }

          this.iban+=" ";
        }

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