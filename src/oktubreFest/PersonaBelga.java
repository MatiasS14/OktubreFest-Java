package oktubreFest;

public class PersonaBelga extends Persona{
	
	public PersonaBelga(Integer peso, Boolean leGustaMusica, Integer aguante) {
		super(peso, leGustaMusica, aguante);
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
