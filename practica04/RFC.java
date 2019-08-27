import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce tu nombre completo:");
		String nombre = scanner.nextLine();

		System.out.println("Introduce tu fecha de nacimiento: dd mm aaaa (con espacios)");
		String fecha = scanner.nextLine();

		//Quitamos espacios al final (solo si existen) y convertimos todo a mayusculas
		String nombre00 = nombre.trim();
		String nombre01 = nombre00.toUpperCase();

    //Primera letra del nombre con charAt
		char inicialNombre = nombre01.charAt(0);

    //Obtener las primeras dos letras del apellido paterno a partir del primer espacio.
		int apaterno = nombre01.indexOf(" ");
		String ap = nombre01.substring(apaterno,apaterno+3);

	  //Obtener la primera letra del apellido materno con lastIndexOf que parte del final de la cadena.
		int amaterno = nombre01.lastIndexOf(" ");
		char am = nombre01.charAt(amaterno+1);

    //Trabajas con substring para que te deuelva un pedazo de la cadena, con los parametros indicados, en este caso las posiciones.
		String dia = fecha.substring(0,2);

		String mes = fecha.substring(3,5);

		String año = fecha.substring(8,10);

		System.out.println("El RFC de "+nombre+" es:" + ap + am + inicialNombre + año + mes + dia );


	}

}
