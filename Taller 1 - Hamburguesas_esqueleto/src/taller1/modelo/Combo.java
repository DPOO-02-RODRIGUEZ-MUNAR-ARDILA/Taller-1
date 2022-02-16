package taller1.modelo;

import java.util.ArrayList;

public class Combo implements Producto {

	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	
	public Combo (String nombrep, double descuentop) {
		nombreCombo = nombrep;
		descuento=descuentop;
		itemsCombo=new ArrayList<ProductoMenu>();
		
	}
	public void agregarItemACombo(Producto itemCombo) {
		itemsCombo.add((ProductoMenu)itemCombo);
	}
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return (int) descuento;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombreCombo;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return descuento + nombreCombo;
	}
	
	
}