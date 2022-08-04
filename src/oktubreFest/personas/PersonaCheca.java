package oktubreFest.personas;

import oktubreFest.cervezas.Marca;

public class PersonaCheca extends Persona{
	
	public PersonaCheca(Integer peso, Boolean leGustaMusica, Integer aguante) {
		super(peso, leGustaMusica, aguante);
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
