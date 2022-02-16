package taller1.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {
	
	private ProductoMenu base;
	
	private ArrayList<Ingrediente>agregados;
	private ArrayList<Ingrediente>eliminados;
	private int preciofinal;
	
	public ProductoAjustado(ProductoMenu base) {
		this.base= base;
		agregados = new ArrayList<Ingrediente>();
		eliminados = new ArrayList<Ingrediente>();
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return base.getPrecio();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return base.getNombre();
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return base.generarTextoFactura();
	}
	public void agregarAgregados (Ingrediente ing) {
		agregados.add(ing);
	}

}
