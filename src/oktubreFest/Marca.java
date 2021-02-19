package oktubreFest;

public abstract class Marca {
	protected Integer gramosLupuloPorLitro;//gramos de lupulo por litro de cerveza
	protected String paisFabricacion;
	
	public Marca(Integer lupuloPorLitro, String paisFabricacion) {
		this.gramosLupuloPorLitro = lupuloPorLitro;
		this.paisFabricacion = paisFabricacion;
	}
	
	public String paisFabricacion() {
		return this.paisFabricacion;
	}
	
	public Integer cantidadLupulo() {
		return this.gramosLupuloPorLitro;		
	}
	
	public abstract Float graduacionDeAlcohol() ;
	
}
