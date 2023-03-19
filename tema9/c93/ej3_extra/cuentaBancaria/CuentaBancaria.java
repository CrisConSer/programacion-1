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

    private static final double interesAnualBasico=0.01;// interés del 1%

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

    // getter "interesAnualBasico"
      public double getInteresAnualBasico(){
        return this.interesAnualBasico;
      }

    /********************/

    /**
      @name: anadir
      @info: añade una cantidad de dinero al saldo de la cuenta, positiva o negativa
      @param cantidad: cantidad a añadir
    */
      public void anadir(double cantidad){
        this.saldo+=cantidad;
      }

    /********************/

    /**
      @name: ingresar
      @info: aumentar el valor del atributo "saldo"
      @param double saldo: valor a sumar al saldo actual
    */
      public void ingresar(double saldo){
        anadir(saldo);
      }

    /********************/

    /**
      @name: retirar
      @info: disminuir el valor del atributo "saldo"
      @param saldo: valor a restar al saldo actual
    */
      public void retirar(double saldo){
        anadir(-saldo);
      }

    /********************/

    /**
      @name: informacionCuenta
      @info: mostrar toda la información de la cuenta
      @param cuenta: cuenta de la que se muestra la información 
    */
      public String informacionCuenta(String cuenta){
        String informacionCuenta="---------------------------------";
          informacionCuenta+="- Número de cuenta: "+getNumeroCuenta();
          informacionCuenta+="- IBAN: "+getIban();
          informacionCuenta+="- Saldo actual: "+getSaldo();

        return informacionCuenta;
      }

    /********************/

    /**
      @name: traspaso
      @info: traspasar dinero de una cuenta a otra
    */
      public void traspaso(){
        
      }

    /********************/

    /**
      @name: calcularIntereses
      @info: calcular intereses de la cuenta
    */
      public abstract void calcularIntereses();

    /********************/

    /**
      @name: toString
      @info: muestreo del número de cuenta
      @param identificativo: identificativo de la cuenta actual
    */
      public String toString(int identificativo){
        String toString="\n~~~~~~~~~~~~~~~~~~~~~~~";
          toString+="- Cuenta número "+identificativo+" -> "+numeroCuenta.substring(numeroCuenta.length()-4);
          toString+="~~~~~~~~~~~~~~~~~~~~~~~";

        return toString;
      }
}