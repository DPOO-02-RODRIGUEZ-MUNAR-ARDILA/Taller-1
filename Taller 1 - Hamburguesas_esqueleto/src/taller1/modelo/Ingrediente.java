package taller1.modelo;

public class Ingrediente implements Producto{
	private String nombre;
	private int precioBase;
	
	public Ingrediente(String nombre, int precio) {
		this.nombre=nombre;
		precioBase=precio;}

	public int getCostoAdicional() {
	return precioBase;
}

	public String getNombre() {
	return nombre;

}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
