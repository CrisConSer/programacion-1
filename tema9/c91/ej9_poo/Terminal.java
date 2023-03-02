/**
  @author: Christian Millán Soria
  @file: Terminal.java
  @info: clase "Terminal" - ejercicio 8
*/

package tema9.c91.ej9_poo;

public class Terminal{
  // atributos
    private String numero;
    private int tiempoConversacion;

  /*****************************/

  // constructor
    public Terminal(String n){
      numero=n;

      tiempoConversacion=0;
    }

    /*****************************/

    // métodos
      // getter para el número
        public String getNumero() {
          return numero;
        }

      /**************/

      // getter para el tiempo de conversación
        public int getTiempoConversacion(){
          return tiempoConversacion;
        }

      /**************/

      /**
        @info: genera una llamada de un terminal a otro
        @param:
          - "t": segundos de la conversación
          - "segundos": segundos de la conversación
      */
        public void llama(Terminal t, int segundos){
          tiempoConversacion+=segundos;

          t.tiempoConversacion+=segundos;
        }

      // método "toString"
        public String toString(){
          return "Nº "+numero+" - "+tiempoConversacion+"s de conversación.";
        }
}