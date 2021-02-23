package oktubreFest;

public class Jarra {
	private Marca marcaCerveza;
	private Integer capacidadJarra;//capacidad en mili litros 
								  //1000 es un litro, 500 es medio
	
	public Jarra(Integer capacidad, Marca marcaCerveza) {
		this.marcaCerveza = marcaCerveza;
		this.capacidadJarra = capacidad;
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
