package day29Test;

public class CSVstateCensus {
	
	
	String state;
	long population;
	int area;
	double density;

	/**
	 *  Parameterized constructor
	 */
	public CSVstateCensus(String state, long population, int area, double density) {
		super();
		this.state = state;
		this.population = population;
		this.area = area;
		this.density = density;
	}

	@Override
	public String toString() {
		return "CSVStateCensus: state=" + state + ", population=" + population + ", areaInSqKm=" + area
				+ ", densityPerSqKm=" + density + "";
	}
}