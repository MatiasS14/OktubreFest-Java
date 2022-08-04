package oktubreFest.cervezas;

public class MarcaCervezaNegra extends Marca{
	private Integer graduacionReglamentaria;
	
	public MarcaCervezaNegra(Integer lupuloPorLitro, String pais, Integer graduacionReglamentaria) {
		super(lupuloPorLitro, pais);
		this.graduacionReglamentaria = graduacionReglamentaria;
	}

	@Override
	public Float graduacionDeAlcohol() {
		if(this.graduacionReglamentaria < this.gramosLupuloPorLitro *2) {
			return this.graduacionReglamentaria / 100f;
		}else {
			return this.gramosLupuloPorLitro* 2f;
		}		
	}
	
	public void actualizarGraduacionReglamentaria(Integer graduacion) {
		this.graduacionReglamentaria = graduacion;
	}

}
