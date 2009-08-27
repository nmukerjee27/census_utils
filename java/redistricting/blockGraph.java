package redistricting;

import java.util.ArrayList;

public class blockGraph {
	public ArrayList<Block> blockList;
	
	public blockGraph(){
		this.blockList = null;
	}
	
	public void addBlock(Block b){
		blockList.add(b);
	}

	public void removeBlock(Block b){
		blockList.remove(b);
	}
}
