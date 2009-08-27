package redistricting;

import java.util.ArrayList;

public class blockGraph {
	public ArrayList<Block> blocklist;
	
	public blockGraph(){
		this.blocklist = null;
	}
	
	public void addBlock(Block b){
		blocklist.add(b);
	}

	public void removeBlock(Block b){
		blocklist.remove(b);
	}
}
