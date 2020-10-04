package dad.maven.gson;

/**
 * @author Ayoze Amaro
 *
 */
public class Persona {
	
	private String nombre;
    private String apellidos;
    private int edad;
	
    // Constructor de la clase Persona que recibe el Nombre, Apellido y Edad
    public Persona(String newNombre, String newApellido, int newEdad) {
    	nombre = newNombre;
    	apellidos = newApellido;
    	edad = newEdad;
    }
    
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
