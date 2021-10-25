import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class ClassList{
	private static ArrayList<ChampClass> classes = _makeClasses();

	public static ArrayList<ChampClass> _makeClasses(){
		ArrayList<ChampClass> classes = new ArrayList<>();
		String fileName = "ClassList.txt";
		try{
			File textFile = new File(fileName);
			Scanner reader = new Scanner(textFile);
			while(reader.hasNextLine()){
				String line = reader.nextLine();
				classes.add(_makeClass(line));	
			}	
			reader.close();
			return classes;
		} catch(FileNotFoundException e){
			System.out.println("File " + fileName + " not Found");
			return null;
		}
	}

	public static ChampClass _makeClass(String line){
		String[] data = line.split(", ", 6);
		String name = data[0];
		return new ChampClass(data[0],
				Integer.parseInt(data[1]),
				Integer.parseInt(data[2]),
				Integer.parseInt(data[3]),
				Integer.parseInt(data[4]),
				Integer.parseInt(data[5]));
	}

	public static int _gradeToInt(String grade){ 
		// This method is redundant now, will probably be deleted soon
		if(grade == "S") return 5;
		else if(grade == "A") return 4;
		else if(grade == "B") return 3;
		else if(grade == "C") return 2;
		else if(grade == "D") return 1;
		else return -1000; //I don't know how to make an error
	}

	public static ChampClass getChampClass(String className){
		for(ChampClass c : classes){
			if(c.getName().equals(className)){
				return c;
			}
		}
		System.out.println("Could not find " + className);
		return null;
	}	
}
