package oktubreFest.cervezas;

import oktubreFest.borradores.BorradorMarca;
import oktubreFest.errores.ErrorMarca;

public class MarcaCervezaRoja extends MarcaCervezaNegra{

	public MarcaCervezaRoja(BorradorMarca marca) throws ErrorMarca{
		super(marca);
	}
	
	public Float graduacionDeAlcohol() {
		return super.graduacionDeAlcohol() * 1.25f;
	}
}
