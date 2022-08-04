package oktubreFest;
import java.util.Set;

import oktubreFest.cervezas.Marca;
import oktubreFest.personas.Persona;

import java.util.HashSet;

public class Carpa {
	private Set<Persona> personasEnCarpa;
	private Marca marcaJarraCerveza;
	private Boolean poseeBanda;
	private Integer limiteCapacidad;
	
	public Carpa(Integer limite, Boolean tieneBanda, Marca marcaJarra) {
		this.personasEnCarpa = new HashSet<Persona>();
		this.marcaJarraCerveza = marcaJarra;
		this.poseeBanda = tieneBanda;
		this.limiteCapacidad = limite;
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
