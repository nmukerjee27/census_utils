package redistricting;

public class District extends blockGraph{
	public int districtNo;
	
	public District(int districtNo){
		this.districtNo=districtNo;
	}
	
	public int getPopulation(){
		int sum=0;
		for(Block b: blockList){
			sum+=b.population;
		}
		return sum;
	}
}
