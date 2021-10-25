// This is the class that keeps track of a champions class e.g. vanguard, marksman, etc
import java.util.*;


public class ChampClass {
	// Somewhere else we will have a charToInt() function that turns the grade into a number
	private String name;
	private HashMap<String, Integer> comps;

	public ChampClass(String name, 
					  int attack, 
					  int catching, 
					  int protect,
					  int siege,
					  int split){
		this.name = name;
		comps = new HashMap<>();
		comps.put("attack", attack);
		comps.put("catch", catching);
		comps.put("protect", protect);
		comps.put("siege", siege);
		comps.put("split", split);
	}

	public String getName(){
		return name;
	}

	public HashMap<String, Integer> getComps(){
		return comps;
	}
}
