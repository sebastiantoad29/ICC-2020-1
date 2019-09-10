public class Libro{
/*
 *Creacion de las variables
 */
  private String titulo;
  private String autor;
  private int anio;
/*
 * Se crea el constructor con los valores iniciales de cada variable
 */
  public Libro(){
    titulo = "";
    autor = "";
    anio = 0;
  }
/*
 *Se crea el constructor para definir los parametros que llevara la clase Libro
 */
  public Libro(String titulo,String autor,int anio){
    this.titulo = titulo;
    this.autor = autor;
    this.anio = anio;
  }
/*
 *Primer metodo para obtener el valor del atributo titulo
 */
  public String getTitulo(){
    return titulo;
  }
/*
 *Segundo metodo para obtener el valor del atributo autor
 */
  public String getAutor(){
    return autor;
  }
/*
 *Tercer metodo para obtener el valor del atributo anio
 */
  public int getAnio(){
    return anio;
  }
/*
 *Se crean los metodos de cada uno de tipo set que no devolvera nada
 *setTitulo, para asignar el valor de titulo a (t) tipo String
 */
  public void setTitulo(String t){
    titulo = t;
/*
 *Se crea el segundo metodo setAutor, para asignar el valor de autor a (a) de tipo String
 */
  }
  public void setAutor(String a){
    autor = a;
/*
 *Se crea el segundo metodo setAnio, para asignar el valor a (an) de tipo Int
 */
  }
  public void setAño(int an){
    anio = an;
  }
}
