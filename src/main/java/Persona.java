import java.util.Vector;

public class Persona extends NIno {
	private String nombre;
	private int edad;
	private Vector<Gato> gatos = new Vector<Gato>();
	private Vector<Perro> perros = new Vector<Perro>();

	public void irALaEscuela() {
		throw new UnsupportedOperationException();
	}

	public Persona() {
		throw new UnsupportedOperationException();
	}
}