package oktubreFest.personas;

import oktubreFest.Carpa;
import oktubreFest.borradores.BorradorPersona;
import oktubreFest.cervezas.Marca;
import oktubreFest.errores.ErrorPersona;

public class PersonaAlemana extends Persona{
	
	public PersonaAlemana(BorradorPersona persona) throws ErrorPersona{
		super(persona);
	}
	
	public String pais() {
		return "Alemania";
	}

	@Override
	public Boolean leGustaMarca(Marca marca) {
		return true;
	}
	
	public Boolean quiereEntrar(Carpa carpa) {
		//si el resto de dividir las personas dentro de la carpa por 2
		//es igual a 0 quiere decir que la cantidad es par
		//lo cual determina que la persona alemana quiere entrar
		//ademas de evaluar la misma funcion de la superclase
		return super.quiereEntrar(carpa) && carpa.cantidadPersonasEnCarpa()%2 == 0; 
	}


}
