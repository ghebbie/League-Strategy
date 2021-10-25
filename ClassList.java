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
				_gradeToInt(data[1]),
				_gradeToInt(data[2]),
				_gradeToInt(data[3]),
				_gradeToInt(data[4]),
				_gradeToInt(data[5]));
	}

	public static int _gradeToInt(String grade){
		if(grade == "S") return 5;
		else if(grade == "A") return 4;
		else if(grade == "B") return 3;
		else if(grade == "C") return 2;
		else if(grade == "D") return 1;
		else return 0; //I don't know how to make an error
	}

	public static ChampClass getClass(String className){
		for(ChampClass c : classes){
			if(c.getName().equals(className)){
				return c;
			}
		}
		System.out.println("Could not find " + className);
		return null;
	}	
}
