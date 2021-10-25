public class Champion {
	private String name;
	private ChampClass cc; // Might need a more informative name for this object

	public Champion(String name, ChampClass cc){
		this.name = name;
		this.cc = cc;
	}

	public String getName(){
		return name;
	}

	public ChampClass getChampClass(){ //getClass() is reserved
		return cc;
	}
}
