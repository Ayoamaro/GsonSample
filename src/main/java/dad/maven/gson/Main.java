package dad.maven.gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Ayoze Amaro
 *
 */
public class Main {

	public static void main(String[] args) {
		// Inicializamos Scanner y la variable newEdad
		Scanner sc = new Scanner(System.in);
		String newNombre, newApellido;
		Integer newEdad = 0;
		Boolean edadValida = false;
		
		// Recogemos el Nombre por pantalla
		do {
			System.out.print("Introduzca su nombre: ");
			newNombre = sc.nextLine();
		} while (newNombre.length() == 0);
		
		// Recogemos el Apellido por pantalla
		do {
			System.out.print("Introduzca su apellido: ");
			newApellido = sc.nextLine();
		} while (newApellido.length() == 0);
		
		// Recogemos la Edad por pantalla
		do {
			System.out.print("Introduzca su edad: ");
			try { 
				newEdad = Integer.parseInt(sc.nextLine());
				if (newEdad > 0) { edadValida = true; }	// Comprobamos que sea por encima de 0 años
			} catch(Exception e) { 
				edadValida = false;
			}
		} while (!edadValida);
		
		// Añadimos los datos introducidos por pantalla a la clase persona.
		Persona p = new Persona(newNombre, newApellido, newEdad);
		
		System.out.println("");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);	// Convertimos los datos en un array tipo JSON
		System.out.println(json);	// Mostramos el JSON con los datos introducidos por pantalla
	}

}
