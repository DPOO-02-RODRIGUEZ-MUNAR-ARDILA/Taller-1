package procesamiento;
import java.util.ArrayList;
public class CalculadoraEstadisticas 
{

}
public int porcentajeMedallistas()
{
	double cantidadAtletas = atletas.size();
	double cantidadMedallistas = 0;
	for (Atleta unAtleta : atletas)
	{
		if (unAtleta.esMedallista())
			cantidadMedallistas++;
	}
	return cantidadMedallistas / cantidadAtletas;
}
