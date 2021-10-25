class Main{
    public static void main(String[] args) {
	print("Let's see if we can print the Juggernaut class:");	    
	ChampClass c = ClassList.getClass("Juggernaut");
	print(c.getName() + ": ");
    }

    public static void print(String s){
	    System.out.println(s);
    }
}

