public class Temperatura{
  public static int Celsius=0;
  public static int Fahrenheit=1;

  double valor;
  int escala;

  public Temperatura(double valor, int escala){
    this.valor = valor;
    this.escala = escala;
}

  public double convertiraCelsius(double valorF){
    return(valorF - 32)/1.8;
  }

  public double convertiraFahrenheit(double valorC){
    return(valorC*1.8)+32;
  }

  public Double obtenerTemperaturaenCelsius(){
      if(escala == Celsius){
        return valor;
      }else {
        return convertiraCelsius(valor);
      }
    }

  public Double obtenerTemperaturaenFahrenheit(){
      if(escala == Fahrenheit){
        return valor;
      }else {
        return convertiraFahrenheit(valor);
      }
    }
  public boolean esMayor(Temperatura temp){
      return obtenerTemperaturaenCelsius() > temp.obtenerTemperaturaenCelsius();
    }
  public boolean esIgual(Temperatura temp){
    return escala == temp.escala && valor == temp.valor;
  }
  public boolean esMenor(Temperatura temp){
    return obtenerTemperaturaenCelsius() < temp.obtenerTemperaturaenCelsius();
  }
  }
