package oktubreFest;
import java.util.Set;

import oktubreFest.borradores.BorradorCarpa;
import oktubreFest.cervezas.Marca;
import oktubreFest.errores.ErrorCarpa;
import oktubreFest.personas.Persona;

import java.util.HashSet;

public class Carpa {
	private Set<Persona> personasEnCarpa;
	private Marca marcaJarraCerveza;
	private Boolean poseeBanda;
	private Integer limiteCapacidad;
	
	public Carpa(BorradorCarpa carpa) throws ErrorCarpa{
		this.personasEnCarpa = new HashSet<Persona>();
		verificarCarpa(carpa);
		this.marcaJarraCerveza = carpa.marcaJarra;
		this.poseeBanda = carpa.tieneBanda;
		this.limiteCapacidad = carpa.limite;
	}
	
	private void verificarCarpa(BorradorCarpa carpa) throws ErrorCarpa{
		if(carpa.tieneBanda == null) {throw new ErrorCarpa("La carpa debe indicar si posee o no una banda");}
		if(carpa.limite == 0) {throw new ErrorCarpa("La carpa debe tener un limite mayor a 0");}
		if(carpa.marcaJarra == null) {throw new ErrorCarpa("La carpa debe tener una marca de cerveza");}
	}
	
	public Integer limiteCapacidad() {
		return this.limiteCapacidad;
	}
	
	public Marca marcaCervezaALaVenta() {
		return this.marcaJarraCerveza;
	}
	
	public Boolean poseeBandaMusica() {
		return this.poseeBanda;
	}
	
	public Boolean puedeEntrar(Persona pers) {
		return this.limiteCapacidad > this.personasEnCarpa.size() && !pers.estaEbria();
	}
	
	public Integer cantEbriosEmpedernidos() {
		Integer ret = 0;
		for(Persona pers : this.personasEnCarpa) {
			if(todasJarrasMinimo1Litro(pers)) {
				ret++;
			}
		}
	  return ret;
	}
	
	//Funcion auxiliar
	//Prop: determina si todas las jarras compradas
	//      por una persona son de un litro o mas
	private Boolean todasJarrasMinimo1Litro(Persona pers) {
		Boolean ret = true;
		for(Jarra jarra : pers.jarrasCompradas()) {
			ret = ret && jarra.capacidadJarra()>= 1000;
		}
	  return ret;
	}
	public void ingresarPersona(Persona persona) {
		this.personasEnCarpa.add(persona);
	}
	
	public Integer cantidadPersonasEnCarpa() {
		return this.personasEnCarpa.size();
	}
}
