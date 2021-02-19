package oktubreFest;

public class Jarra {
	private Marca marcaCerveza;
	private Integer capacidadJarra;//capacidad en litros
	
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

}
