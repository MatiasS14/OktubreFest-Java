package testOktubreFest;
import oktubreFest.*;
import oktubreFest.borradores.BorradorCarpa;
import oktubreFest.borradores.BorradorJarra;
import oktubreFest.borradores.BorradorMarca;
import oktubreFest.cervezas.Marca;
import oktubreFest.cervezas.MarcaCervezaNegra;
import oktubreFest.cervezas.MarcaCervezaRoja;
import oktubreFest.cervezas.MarcaCervezaRubia;
import oktubreFest.errores.ErrorCarpa;
import oktubreFest.errores.ErrorJarra;
import oktubreFest.errores.ErrorMarca;
import oktubreFest.personas.Persona;
import oktubreFest.personas.PersonaAlemana;
import oktubreFest.personas.PersonaBelga;
import oktubreFest.personas.PersonaCheca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOktubreFest {
	
	//Graduacion mundial reglamentaria para la cerveza negra
	Integer graduacionMundialNegra;
	
	//Borradores marcas
	BorradorMarca borradorQuilmesRubia;
	BorradorMarca borradorQuilmesNegra;
	BorradorMarca borradorQuilmesRoja;
	BorradorMarca borradorCorona;
	
	//Marcas de cervezas
	Marca quilmesRubia;
	Marca quilmesNegra;
	Marca quilmesRoja;
	Marca corona;
	
	//Borrador carpa
	BorradorCarpa borradorCarpaQuilmesRubia;
	BorradorCarpa borradorCarpaQuilmesNegra;
	BorradorCarpa borradorCarpaQuilmesRoja;
	BorradorCarpa borradorCarpaCorona;

	//Carpas
	Carpa carpaQuilmesRubia;
	Carpa carpaQuilmesNegra;
	Carpa carpaQuilmesRoja;
	Carpa carpaCorona;
	
	//Borradores jarras
	//1 Litro
	BorradorJarra borradorJarraQuilmesRLitro;
	BorradorJarra borradorJarraQuilmesNLitro;
	BorradorJarra borradorJarraQuilmesRojLitro;
	BorradorJarra borradorJarraCoronaLitro;
	//Medio litro
	BorradorJarra borradorJarraQuilmesRMedioLitro;
	BorradorJarra borradorJarraQuilmesNMedioLitro;
	BorradorJarra borradorJarraQuilmesRojMedioLitro;
	BorradorJarra borradorJarraCoronaMedioLitro;
	
	//Jarras
		//jarras de medio lirto
	Jarra jarraQuilmesRMedioLitro;
	Jarra jarraQuilmesNMedioLitro;
	Jarra jarraQuilmesRojMedioLitro;
	Jarra jarraCoronaMedioLitro;
		//jarras de un litro
	Jarra jarraQuilmesRLitro;
	Jarra jarraQuilmesNLitro;
	Jarra jarraQuilmesRojLitro;
	Jarra jarraCoronaLitro;

	//Personas
	Persona aleman1;
	Persona aleman2;
	Persona belga1;
	Persona belga2;
	Persona checo1;
	Persona checo2;
	
	@BeforeEach
	void setup() throws ErrorCarpa, ErrorJarra, ErrorMarca{
		//graduacion reglamentaria para la cerveza negra
		graduacionMundialNegra = 15;
	/////////////////////////////////////////////////////////////////
		//borradores marca cerveza
		borradorQuilmesRubia = new BorradorMarca(20, "Alemania", 8);//20 gr lupulo por litro
		//origen Alemania
		//8% de alcohol por litro
		//quilmesNegra: 10gr lupulo por litro
		//origen Belgica
		borradorQuilmesNegra = new BorradorMarca(10, "Belgica", graduacionMundialNegra);

		//quilmesRoja : 10gr lupulo por litro
		//origen Alemania
		borradorQuilmesRoja  = new BorradorMarca(10, "Alemania", graduacionMundialNegra);

		//corona: rubia
		//30gr lupulo por litro
		//origen Republica Checa
		//10% alcohol por litro
		borradorCorona = new BorradorMarca(30, "RepublicaCheca", 10);
		
	
		//marcas de cerveza
		quilmesRubia = new MarcaCervezaRubia(borradorQuilmesRubia);
		quilmesNegra = new MarcaCervezaNegra(borradorQuilmesNegra);
		quilmesRoja  = new MarcaCervezaRoja(borradorQuilmesRoja);
		corona		 = new MarcaCervezaRubia(borradorCorona);
	/////////////////////////////////////////////////////////////////
		//Borrador carpas
	borradorCarpaQuilmesRubia = new BorradorCarpa(30, true, quilmesRubia);
	borradorCarpaQuilmesNegra = new BorradorCarpa(30, true, quilmesNegra);
	borradorCarpaQuilmesRoja  = new BorradorCarpa(3, true, quilmesRoja);
	borradorCarpaCorona       = new BorradorCarpa(3, false, corona);
		//Carpas
	carpaQuilmesRubia = new Carpa(borradorCarpaQuilmesRubia);
	carpaQuilmesNegra= new Carpa(borradorCarpaQuilmesNegra);
	carpaQuilmesRoja= new Carpa(borradorCarpaQuilmesRoja);
	carpaCorona = new Carpa(borradorCarpaCorona);
	/////////////////////////////////////////////////////////////////
		//Borradores jarras
		//1 Litro
	borradorJarraQuilmesRLitro = new BorradorJarra(1000, quilmesRubia);
	borradorJarraQuilmesNLitro = new BorradorJarra(1000, quilmesNegra);
	borradorJarraQuilmesRojLitro= new BorradorJarra(1000, quilmesRoja);
	borradorJarraCoronaLitro = new BorradorJarra(1000, corona);
		//Medio litro
	borradorJarraQuilmesRMedioLitro = new BorradorJarra(500, quilmesRubia);
	borradorJarraQuilmesNMedioLitro = new BorradorJarra(500, quilmesNegra);
	borradorJarraQuilmesRojMedioLitro = new BorradorJarra(500, quilmesRoja);
	borradorJarraCoronaMedioLitro = new BorradorJarra(500, corona);
	
		//Jarras de 1 litro (la capacidad de la jarra es en mililitros 1000ml = 1lts)
	jarraQuilmesRLitro = new Jarra(borradorJarraQuilmesRLitro);
	jarraQuilmesNLitro = new Jarra(borradorJarraQuilmesNLitro);
	jarraQuilmesRojLitro= new Jarra(borradorJarraQuilmesRojLitro);
	jarraCoronaLitro = new Jarra(borradorJarraCoronaLitro);
		//Jarras de medio litro (la capacidad de la jarra es en mililitros 500ml = 1/2lts)
	jarraQuilmesRMedioLitro = new Jarra(borradorJarraQuilmesRMedioLitro);
	jarraQuilmesNMedioLitro = new Jarra(borradorJarraQuilmesNMedioLitro);
	jarraQuilmesRojMedioLitro = new Jarra(borradorJarraQuilmesRojMedioLitro);
	jarraCoronaMedioLitro = new Jarra(borradorJarraCoronaMedioLitro);
	/////////////////////////////////////////////////////////////////
		//Personas
	aleman1 = new PersonaAlemana(80, false, 1000); //pesa 80ks, no le gusta la musica,
												   //su nivel de aguante es 1000
	
	aleman2 = new PersonaAlemana(74, true, 500);//pesa 74 ks, le gusta la musica,
											    //su nivel de aguante es 500
	
	belga1	= new PersonaBelga(100, true, 2000);//pesa 100kg, le gusta la musica,
												//su nivel de aguante es 2000
	
	belga2  = new PersonaBelga(90, true, 1500);//pesa 90kg, le gusta la musica,
											   //su nivel de auguante es de 1500
	
	checo1 	= new PersonaCheca(150, false, 100);//pesa 150kg, no le gusta la musica
											    //su nivel de aguante es de 100,
			
	checo2	= new PersonaCheca(70, true, 2000);//pesa 70kg, le gusta la musica,
											   //su nivel de aguante es de 2000
	
	}
	
	@Test
	void testContenidoAlcoholicoJarra() {
		//contenidoAlcoholico de jarra de cerveza rubia de 1 litro
		assertEquals(80, jarraQuilmesRLitro.contenidoAlcoholico());

		//contenidoAlcoholico de jarra de cerveza negra de 1 litro
		assertEquals(150, jarraQuilmesNLitro.contenidoAlcoholico());

		//contenidoAlcoholico de jarra de cerveza roja de 1 litro
		assertEquals(187.5f, jarraQuilmesRojLitro.contenidoAlcoholico());

		//contenidoAlcoholico de jarra de cerveza rubia de 1/2 litro
		assertEquals(40, jarraQuilmesRMedioLitro.contenidoAlcoholico());

		//contenidoAlcoholico de jarra de cerveza negra de 1/2 litro
		assertEquals(75, jarraQuilmesNMedioLitro.contenidoAlcoholico());

		//contenidoAlcoholico de jarra de cerveza Roja de 1/2 litro
		assertEquals(93.75f, jarraQuilmesRojMedioLitro.contenidoAlcoholico());		
	}
	
	@Test
	void testCantidadAlcoholIngerido() {
		aleman1.consumirJarra(jarraCoronaLitro);
		aleman1.consumirJarra(jarraCoronaLitro);
		aleman1.consumirJarra(jarraCoronaLitro);
		assertEquals(3000, aleman1.totalLitrosIngeridos());
	}
	@Test
	void personaEstaEbria() {
		assertFalse(aleman1.estaEbria());
		aleman1.consumirJarra(jarraQuilmesNLitro);
		aleman1.consumirJarra(jarraQuilmesRLitro);
		assertTrue(aleman1.estaEbria());		
	}
	
	@Test
	void personaQuiereEntrarEnCarpa() {
		assertTrue(checo2.quiereEntrar(carpaQuilmesNegra));
		assertFalse(checo1.quiereEntrar(carpaQuilmesNegra));
		
		//aleman2 quiere entrar en carpaQuilmesNegra
		assertTrue(aleman2.quiereEntrar(carpaQuilmesNegra));
		//ingresa una persona a la carpa
		carpaQuilmesNegra.ingresarPersona(checo2);
		//aleman2 no quiere entrar a la carpaQuilmesNegra
		//por que la cantidad de personas dentro es impar
		assertFalse(aleman2.quiereEntrar(carpaQuilmesNegra));		
	}
	
	@Test
	void testCarpaDejaEntrarAPersona() {
		assertTrue(carpaQuilmesRoja.puedeEntrar(aleman1));
		assertFalse(aleman1.estaEbria());	
		aleman1.consumirJarra(jarraCoronaLitro);
		aleman1.consumirJarra(jarraCoronaLitro);
		aleman1.consumirJarra(jarraCoronaLitro);
		assertTrue(aleman1.estaEbria());//aleman1 esta ebrio
		assertFalse(carpaQuilmesRoja.puedeEntrar(aleman1));//lo cual le impide ingresar
		
		assertTrue(carpaQuilmesRoja.puedeEntrar(aleman2));
		assertTrue(carpaQuilmesRoja.puedeEntrar(belga1));
		assertTrue(carpaQuilmesRoja.puedeEntrar(belga2));
		assertTrue(carpaQuilmesRoja.puedeEntrar(checo1));//checo1 puede ingresar
		assertTrue(carpaQuilmesRoja.puedeEntrar(checo2));
		//ingresan 3 personas a la carpaQuilmesRoja
		aleman2.entrarEnCarpa(carpaQuilmesRoja);
		belga1.entrarEnCarpa(carpaQuilmesRoja);
		belga2.entrarEnCarpa(carpaQuilmesRoja);
		assertFalse(carpaQuilmesRoja.puedeEntrar(checo1));//checo1 ya no puede ingresar
														  //porque supera la capacidad
	}
	
	@Test
	void testPersonaPuedeEntrarACarpa() {
		assertTrue(aleman2.puedeEntrar(carpaQuilmesNegra));
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		assertFalse(aleman2.puedeEntrar(carpaQuilmesNegra));
	}
	
	@Test
	void testPersonaEntraACarpa() {
		aleman2.entrarEnCarpa(carpaQuilmesNegra);
		try {
			aleman1.entrarEnCarpa(carpaQuilmesNegra);
		}
		catch(RuntimeException e){
			System.out.println(e);
			}
	}
	
	@Test
	void testEbriosEmpedernidos() {
		aleman2.entrarEnCarpa(carpaQuilmesRoja);
		belga1.entrarEnCarpa(carpaQuilmesRoja);
		belga2.entrarEnCarpa(carpaQuilmesRoja);
		
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		aleman2.consumirJarra(jarraQuilmesRojLitro);

		belga1.consumirJarra(jarraQuilmesRojLitro);
		belga1.consumirJarra(jarraQuilmesRojLitro);
		belga1.consumirJarra(jarraQuilmesRojLitro);

		belga2.consumirJarra(jarraQuilmesRojMedioLitro);
		belga2.consumirJarra(jarraQuilmesRojMedioLitro);
		belga2.consumirJarra(jarraQuilmesRojMedioLitro);
		
		assertEquals(2, carpaQuilmesRoja.cantEbriosEmpedernidos());
	}
	
	@Test
	void testPersonaEsPatriota() {
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		aleman2.consumirJarra(jarraQuilmesRojLitro);
		assertTrue(aleman2.esPatriota());
		aleman2.consumirJarra(jarraQuilmesNLitro);
		assertFalse(aleman2.esPatriota());
	}
	
	

}
