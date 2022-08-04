package oktubreFest.cervezas;

public class MarcaCervezaRubia extends Marca{
	private Integer graduacionDeAlcohol;
	
	public MarcaCervezaRubia(Integer lupulo, String pais, Integer graduacion) {
		super(lupulo, pais);
		this.graduacionDeAlcohol = graduacion;
	}
	
	@Override
	public Float graduacionDeAlcohol() {
		return this.graduacionDeAlcohol / 100f;
	}

}
