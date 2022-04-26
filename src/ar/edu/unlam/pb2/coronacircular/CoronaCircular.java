package ar.edu.unlam.pb2.coronacircular;

public class CoronaCircular {

	private Integer radioInterior;
	private Integer radioExterior;

	public CoronaCircular(Integer radioInterior, Integer radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public Integer getRadioInterior() {

		return this.radioInterior;
	}

	public Integer getRadioExterior() {

		return this.radioExterior;
	}

	public Double getPerimetro() {
		return 2 * Math.PI * (this.getRadioInterior() + this.getRadioExterior());
	}

	public Double getArea() {
		
		return Math.PI*((Math.pow(this.getRadioExterior(), 2)-Math.pow(this.getRadioInterior(),2)));
	}

}
