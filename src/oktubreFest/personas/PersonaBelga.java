package oktubreFest.personas;

import oktubreFest.borradores.BorradorPersona;
import oktubreFest.cervezas.Marca;
import oktubreFest.errores.ErrorPersona;

public class PersonaBelga extends Persona{
	
	public PersonaBelga(BorradorPersona persona) throws ErrorPersona{
		super(persona);
	}

	@Override
	public Boolean leGustaMarca(Marca marca) {
		return marca.cantidadLupulo() > 4;
	}

	@Override
	protected String pais() {
		return "Belgica";
	}

}
