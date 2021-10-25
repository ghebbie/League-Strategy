
class Main{
    public static void main(String[] args) { //Right now this method is used for testing
	print("Let's see if we can print the Juggernaut class:");	    
	ChampClass c = ClassList.getChampClass("Juggernaut");
	print(c.getName() + ": " + c.getComps());
    }

    public static void print(String s){
	    System.out.println(s);
    }
}

