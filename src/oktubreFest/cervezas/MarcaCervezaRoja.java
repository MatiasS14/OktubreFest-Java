package oktubreFest.cervezas;

public class MarcaCervezaRoja extends MarcaCervezaNegra{

	public MarcaCervezaRoja(Integer lupuloPorLitro, String pais, Integer graduacionReglamentaria) {
		super(lupuloPorLitro, pais, graduacionReglamentaria);
	}
	
	public Float graduacionDeAlcohol() {
		return super.graduacionDeAlcohol() * 1.25f;
	}
}
