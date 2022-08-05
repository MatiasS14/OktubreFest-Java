package oktubreFest;

import oktubreFest.borradores.BorradorJarra;
import oktubreFest.cervezas.Marca;
import oktubreFest.errores.ErrorJarra;

public class Jarra {
	private Marca marcaCerveza;
	private Integer capacidadJarra;//capacidad en mili litros 
								  //1000 es un litro, 500 es medio
	
	public Jarra(BorradorJarra jarra) throws ErrorJarra{
		verificarJarra(jarra);
		this.marcaCerveza = jarra.marca;
		this.capacidadJarra = jarra.capacidad;
	}
	
	private void verificarJarra(BorradorJarra jarra) throws ErrorJarra{
		if(jarra.capacidad != 500 && jarra.capacidad != 1000) {
			throw new ErrorJarra("La jarra debe ser de 500ml o 1000ml");
		}
	}
	
	public Marca marcaCerveza() {
		return this.marcaCerveza;
	}
	
	public Integer capacidadJarra() {
		return this.capacidadJarra;
	}
	
	public Float contenidoAlcoholico() {
		return this.capacidadJarra * this.marcaCerveza.graduacionDeAlcohol();
	}

}
