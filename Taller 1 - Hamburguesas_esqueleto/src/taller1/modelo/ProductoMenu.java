package taller1.modelo;

public class ProductoMenu implements Producto{
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombre, int precio) {
		this.nombre=nombre;
		precioBase=precio;
	}
	
	public int getPrecio() {
		// TODO Auto-generated method stub
		return precioBase;
	}
	
	public String getNombre() {
		// TODO Auto-generated method stubg
		return nombre;
	}
	
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return nombre + "     "+ precioBase;
	}

}