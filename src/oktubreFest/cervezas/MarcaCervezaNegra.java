package oktubreFest.cervezas;

import org.junit.platform.commons.util.StringUtils;

import oktubreFest.borradores.BorradorMarca;
import oktubreFest.errores.ErrorMarca;

public class MarcaCervezaNegra extends Marca{
	private Integer graduacionReglamentaria;
	
	public MarcaCervezaNegra(BorradorMarca marca) throws ErrorMarca{
		super(marca.lupulo, marca.pais);
		verificarMarca(marca);
		this.graduacionReglamentaria = marca.graduacion;
	}
	
	private void verificarMarca(BorradorMarca marca) throws ErrorMarca{
		if(marca.lupulo < 1) {throw new ErrorMarca("La cerveza debe tener mas de 0% de lupulo");}
		if(StringUtils.isBlank(marca.pais)) {throw new ErrorMarca("La cerveza debe tener un pais de procedencia");}
		if(marca.graduacion < 1) {throw new ErrorMarca("La cerveza debe tener mas de 0% de alcohol");}
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
