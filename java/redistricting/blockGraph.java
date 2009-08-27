package redistricting;

import java.util.ArrayList;
/**	
 * Copyright (C) 2009
 * @author Joshua Justice
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *	The JavaDBF library is licensed under the GNU Lesser General Public License.
 *	A copy of the GNU LGPL should be included in the merge-xbase folder.
 *	If it is not, it can be found on http://www.gnu.org/licenses/lgpl-3.0.txt .
 *	For details regarding JavaDBF, see http://javadbf.sarovar.org/
 *	
 *
*/
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
	
	public void load(){
		//first, loop through DBF file, add blocks from file
		
		
		//second, loop through GAL file and add neighbors
	}
	
	public void save(){
		//should support writing to a file somehow
		
	}
	
}
