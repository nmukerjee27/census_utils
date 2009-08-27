package redistricting;

import java.util.ArrayList;

public class Block {
	public final int recordNo; 
	public ArrayList<Block> neighbors;
	public int population;
	public int area;
	public double popDensity;
	public int[] data;
	
	public Block(int recordNo, int population, int area){
		this.recordNo=recordNo;
		this.population=population;
		this.area=area;
		popDensity = (double) population / (double) area; 
	}
	
}
