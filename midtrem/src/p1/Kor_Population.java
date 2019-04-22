package p1;

public class Kor_Population {
	private double population;
	private double growthRate;
	
	public Kor_Population(double pop, double growthRate) {
		this.growthRate = growthRate;
		this.population = pop;
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
	
	public double nextKorPop(int year) {
		double nextPop = this.population;
		
		for (int i = 0; i < year; i++) 
			nextPop = nextPop-nextPop*this.growthRate/100;
		
		return nextPop;
	}
	
	public int findHalfPop() {
		int year = 0;
		double nextPop = this.population;
		
		while(this.population/2 <= nextPop) {
			year++;
			nextPop = this.nextKorPop(year);
		}
		
		System.out.println(year+"년 후 세계인구가 1/2배가 됩니다.  ("+nextPop+")");
		return year;
	}
}
