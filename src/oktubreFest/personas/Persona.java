package oktubreFest.personas;
import java.util.List;

import oktubreFest.Carpa;
import oktubreFest.Jarra;
import oktubreFest.borradores.BorradorPersona;
import oktubreFest.cervezas.Marca;
import oktubreFest.errores.ErrorPersona;

import java.util.LinkedList;

public abstract class Persona {
	protected Integer pesoEnKilos;
	protected Boolean leGustaLaMusica;
	protected Integer nivelDeAguante;
	protected List<Jarra> jarrasCompradas;
	protected String paisPersona;
	
	public Persona(BorradorPersona persona) throws ErrorPersona{
		verificarPersona(persona);
		this.pesoEnKilos = persona.peso;
		this.leGustaLaMusica = persona.leGustaMusica;
		this.nivelDeAguante = persona.nivelAguante;
		this.jarrasCompradas = new LinkedList<Jarra>();
	}
	
	private void verificarPersona(BorradorPersona persona) throws ErrorPersona{
		if(persona.peso < 1) {throw new ErrorPersona("La persona debe tenes un peso mayor a 1");}
		if(persona.nivelAguante == 0 ) {throw new ErrorPersona("La persona debe tener al menos 1 de aguante");}
	}
	
	public Boolean estaEbria() {
		//si la cantidad de litros ingeridos multiplicado
		// por el peso de la persona, supera el nivel de aguante,
		//quiere decir que la persona se encuentra ebria.
		return this.totalLitrosIngeridos() * this.pesoEnKilos > this.nivelDeAguante;
	}
	
	//Funcion Auxiliar
	//Proposito : cuenta cuantos litros lleva bebidos la persona
	public Integer totalLitrosIngeridos() {
		Integer ret= 0;
		for(Jarra jarra : this.jarrasCompradas) {
			ret+= jarra.capacidadJarra();
		}
	  return ret;
	}
	
	public abstract Boolean leGustaMarca(Marca marca);
	
	public Boolean quiereEntrar(Carpa carpa) {
		return this.leGustaMarca(carpa.marcaCervezaALaVenta()) &&
				this.leGustaLaMusica && carpa.poseeBandaMusica();
	}
	
	public Boolean puedeEntrar(Carpa carpa) {
		return this.quiereEntrar(carpa) && carpa.puedeEntrar(this);
	}
	
	public void entrarEnCarpa(Carpa carpa) {
		if(this.puedeEntrar(carpa)) {
			carpa.ingresarPersona(this);
		}else {
			throw new RuntimeException("La Persona no puede ingresar");
		}
	}
	
	public Boolean esPatriota() {
		if(this.paisDeCervezasBebidas().size() == 1) {
			return this.paisDeCervezasBebidas().contains(this.pais());
		}else {
			return false;
		}
	}
	//Funciones auxiliares
	//Proposito : retorna un set con los paises de las jarras
	// 			 bebidas hasta el momento
	private List<String> paisDeCervezasBebidas(){
		List<String> paises = new LinkedList<String>();
		for(Jarra jarra : this.jarrasCompradas) {
			if(!paises.contains(jarra.marcaCerveza().paisFabricacion())) {
				paises.add(jarra.marcaCerveza().paisFabricacion());
		    }
		}
	 return paises;
	}
	//Proposito : retorna el pais de origen de la persona
	protected abstract String pais();
	
	public List<Jarra> jarrasCompradas(){
		return this.jarrasCompradas;
	}
	
	public void consumirJarra(Jarra jarra) {
		this.jarrasCompradas.add(jarra);
	}
}
