package ar.edu.unlam.pb2.coronacircular;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CoronaCircularTest {

	private static final double PERIMETRO_ESPERADO = 18.84;
	private static final double AREA_ESPERADA = 9.42;
	private static final Integer RADIO_INTERIOR = 1;
	private static final Integer RADIO_EXTERIOR = 2;

	@Test
	public void alCrearUnaCoronaCircularSeInicializaConSuRadioInteriorYExterior() {
		CoronaCircular corona = cuandoCreoUnaCoronaCirucular(RADIO_INTERIOR, RADIO_EXTERIOR);
		laCoronaTieneRadioInteriorYExterior(corona);
	}
/////////////////////////////////	
	private CoronaCircular cuandoCreoUnaCoronaCirucular(Integer radioInterior, Integer radioExterior) {
		return new CoronaCircular(radioInterior, radioExterior);
	}

	private void laCoronaTieneRadioInteriorYExterior(CoronaCircular corona) {
		Assert.assertEquals(Integer.valueOf(RADIO_INTERIOR), corona.getRadioInterior());
		Assert.assertEquals(Integer.valueOf(RADIO_EXTERIOR), corona.getRadioExterior());
	}
///////////////////////////////////
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YExterior_2_SuPerimetroEs_18_8495559215() {
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		Double perimetroObtenido = cuandoObtengoElPerimetro(corona);
		entoncesSuPerimetroEs(perimetroObtenido,PERIMETRO_ESPERADO);
	}
////////////////////
	private CoronaCircular dadoQueExisteCoronaCircular(Integer radioInterior, Integer radioExterior) {
		return new CoronaCircular(radioInterior,radioExterior);
	}
	
	private Double cuandoObtengoElPerimetro(CoronaCircular corona) {
		return corona.getPerimetro();
	}
	private void entoncesSuPerimetroEs(Double perimetroObtenido, Double d) {
		//Assert.assertEquals(perimetroObtenido, d);
		Assert.assertEquals(perimetroObtenido, d, 0.01);
	}
///////////////////////////
	@Test
	public void alCrearUnaCoronaCircularConRadioInterior_1_YExterior_2_SuAreaoEs_X() {
		CoronaCircular corona = dadoQueExisteCoronaCircular(RADIO_INTERIOR, RADIO_EXTERIOR);
		Double areaObtenida = cuandoObtengoElArea(corona);
		entoncesSuAreaEs(areaObtenida,AREA_ESPERADA);
	}
	private void entoncesSuAreaEs(Double areaObtenida, Double areaEsperada) {
		Assert.assertEquals(areaObtenida, areaEsperada, 0.01);
		
	}
	private Double cuandoObtengoElArea(CoronaCircular corona) {
		return corona.getArea();
	}
	
}
