package oktubreFest.personas;

import oktubreFest.borradores.BorradorPersona;
import oktubreFest.cervezas.Marca;
import oktubreFest.errores.ErrorPersona;

public class PersonaCheca extends Persona{
	
	public PersonaCheca(BorradorPersona persona) throws ErrorPersona{
		super(persona);
	}

	@Override
	public Boolean leGustaMarca(Marca marca) {
		return marca.graduacionDeAlcohol() > 0.08f;
	}

	@Override
	protected String pais() {
		return "Republica Checa";
	}

}
