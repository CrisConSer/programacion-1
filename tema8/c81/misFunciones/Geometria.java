package tema8.c81.misFunciones;

public class Geometria{
  /**
    @info: función para calcular el perímetro de un rectángulo
    @param:
      - "ancho": ancho del rectángulo
      - "alto": alto del rectángulo
    @return perimetro: perímetro del rectángulo
  */
    public static double perimetroRectangulo(double ancho, double alto){
      // variable para el perímetro
        double perimetro=(ancho*=2)+(alto*=2);

      /***************/

      // return
        return perimetro;
    }

  /***************************************************/

  /**
    @info: función para calcular el área de un rectángulo
    @param:
      - "ancho": ancho del rectángulo
      - "alto": alto del rectángulo
    @return area: área del rectángulo
  */
    public static double areaRectangulo(double ancho, double alto){
      // variable para el perímetro
        double area=ancho*alto;

      /***************/

      // return
        return area;
    }
}