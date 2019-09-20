package geometria;

public class Triangulo{
  //Creacion de los atributos, en este caso los tres puntos.
  private Punto p1;
  private Punto p2;
  private Punto p3;
  /*
   *Creacion de los campos que seran estaticos
   */
  public static final int EQUILATERO = 0;
  public static final int ISOSCELES = 1;
  public static final int ESCALENO = 2;
  /*
   *Asignacion de los valores para cada punto del triangulo
   */
  public Triangulo(){
   p1 = new Punto(0,0);
   p2 = new Punto(1,0);
   p3 = new Punto(0.5,Math.sin(Math.PI/3));
  }
  /*
   *Creacion del triangulo con los puntos dados
   */
  public Triangulo(Punto p1, Punto p2, Punto p3){
  this.p1 = p1;
  this.p2 = p2;
  this.p3 = p3;
  }
  /*
   *Creacion de los metodos para obtener los puntos de los triangulos
   */
  public Punto getp1(){
    return p1;
  }
  public Punto getp2(){
    return p2;
  }
  public Punto getp3(){
    return p3;
  }
  /*
   *Creacion del metodo para saber si los vertices alineados
   *si los vertices estan alineados, regresa true.
   */
  public boolean tieneVerticesAlineados(){
   return p1.estanAlineados(p2,p3);
 }
  /*
   *Creacion del metodo que definira si un triangulo es Equilatero, Isosceles o Escaleno.
   */
  public int tipo(){
    if(p1.distancia(p2) == p2.distancia(p3) && p1.distancia(p3) == p2.distancia(p3)){
      return EQUILATERO;
    }else if(p1.distancia(p2) != p2.distancia(p3) && p1.distancia(p3) != p2.distancia(p3) && p1.distancia(p2) != p1.distancia(p3)){
      return ESCALENO;
    }else
      return ISOSCELES;
  }
}
