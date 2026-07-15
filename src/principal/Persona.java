package principal;

public class Persona implements Comparable<Persona> {

	private String cedula;
	private String nombre;

	public Persona(String cedula, String nombre) {
		this.cedula = cedula;
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " | Cedula: " + this.getCedula() + "\n";
	}

	@Override
	public int compareTo(Persona p) {
		if (p.getCedula().compareTo(this.getCedula()) == 0) {
			return 0;
		} else if (p.getCedula().compareTo(this.getCedula()) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
