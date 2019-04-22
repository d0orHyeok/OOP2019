package p439;

public class PopGrowth {
	private double population;
	private double growthRate;

	public PopGrowth(double population, double growthRate) {
		this.population = population;
		this.growthRate = growthRate;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public double getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}
	
	public double nextWorldPop(int year) {
		double nextPop = this.population;
		
		for (int i = 0; i < year; i++) 
			nextPop = nextPop+nextPop*this.growthRate/100;
		
		return nextPop;
	}
	
	public int findDoublePop() {
		int year = 0;
		double nextPop = 0;
		
		while(this.population*2 > nextPop) {
			year++;
			nextPop = this.nextWorldPop(year);
		}
		
		System.out.println(year+"년 후 세계인구가 2배가 됩니다.  ("+nextPop+")");
		return year;
	}
}
