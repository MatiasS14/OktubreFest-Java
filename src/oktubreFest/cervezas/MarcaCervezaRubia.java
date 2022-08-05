package oktubreFest.cervezas;

import org.junit.platform.commons.util.StringUtils;
import oktubreFest.borradores.BorradorMarca;
import oktubreFest.errores.ErrorMarca;

public class MarcaCervezaRubia extends Marca{
	private Integer graduacionDeAlcohol;
	
	public MarcaCervezaRubia(BorradorMarca marca) throws ErrorMarca{
		super(marca.lupulo, marca.pais);
		verificarMarca(marca);
		this.graduacionDeAlcohol = marca.graduacion;
	}
	
	private void verificarMarca(BorradorMarca marca) throws ErrorMarca{
		if(marca.lupulo < 1) {throw new ErrorMarca("La cerveza debe tener mas de 0% de lupulo");}
		if(StringUtils.isBlank(marca.pais)) {throw new ErrorMarca("La cerveza debe tener un pais de procedencia");}
		if(marca.graduacion < 1) {throw new ErrorMarca("La cerveza debe tener mas de 0% de alcohol");}
	}
	
	@Override
	public Float graduacionDeAlcohol() {
		return this.graduacionDeAlcohol / 100f;
	}

}
