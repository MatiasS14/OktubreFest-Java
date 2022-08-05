package oktubreFest.borradores;

import oktubreFest.cervezas.Marca;

public class BorradorCarpa {
	public Integer limite;
	public Boolean tieneBanda;
	public Marca marcaJarra;
	
	public BorradorCarpa(Integer limite, Boolean tieneBanda, Marca marca) {
		this.limite = limite;
		this.tieneBanda = tieneBanda;
		this.marcaJarra = marca;
	}
}
