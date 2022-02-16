package taller1.consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;


public class Consola
{
	
	private CalculadoraEstadisticas calculadora;
	public void ejecutarAplicacion()
	{
		System.out.println("TALLER 1: HAMBURGUESAS\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input1("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					ejecutarIniciarPedido();
				else if (opcion_seleccionada == 2)
					ejecutarAgregarElemento();
				else if (opcion_seleccionada == 3)
					ejecutarCerrarPedido();
				else if (opcion_seleccionada == 4)
					ejecutarConsultarInfoPedido();	
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicaciÃ³n\n");
		System.out.println("1. Iniciar un nuevo pedido");
		System.out.println("2. Agregar un elemento a un pedido");
		System.out.println("3.Cerrar un pedido y guardar la factura");
		System.out.println("4. Consultar la información de un pedido dado su id");
	}

	private void ejecutarIniciarPedido()
	{
		System.out.println("\n" + "Iniciar un nuevo pedido" + "\n");
	
		int seleccionar_ = Integer.parseInt(input1("Por favor seleccione una opción"))

	}
	private void ejecutarAgregarElemento()
	{
		System.out.println("\n" + "Agregar un elemento a un pedido" + "\n");
	}

	
	
	private void ejecutarCerrarPedido()
	{
		System.out.println("\n" + "Cerrar un pedido y guardar la factura" + "\n");
	}
	
	private void ejecutarConsultarInfoPedido()
	{
		System.out.println("\n" + "Consultar la información de un pedido dado su id" + "\n");
	}

	public String input1(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	
	public static void main(String[] args)
	{
		Consola consola = new Consola();
		consola.ejecutarAplicacion();
	}
	}