import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class ClassList{
	public static arraylist<champclass> classes = makeClasses();

	public static ArrayList<ChampClass> makeClasses(){
		arraylist<champclass> classes = new ArrayList<>();
		String fileName = "ClassList.txt";
		try{
			File textFile = new File(fileName);
			Scanner reader = new Scanner(textFile);
			while(reader.hasNextLine()){
				String line = reader.nextLine();
				classes.add(makeClass(line));	
			}	
			reader.close();
		} catch(FileNotFoundException){
			System.out.println("File " + fileName + " not Found");
			return null;
		}
	}

	public static ChampClass makeClass(String line){
		String[] data = line.split(", ", 6);
		String name = data[0];
		return new ChampClass(data[0],
				gradeToInt(data[1]),
				gradeToInt(data[2]),
				gradeToInt(data[3]),
				gradeToInt(data[4]),
				gradeToInt(data[5]),)
	}

	public static int gradeToInt(String grade){
		if(grade == "S") return 5;
		else if(grade == "A") return 4;
		else if(grade == "B") return 3;
		else if(grade == "C") return 2;
		else if(grade == "D") return 1;
		else return 0; //I don't know how to make an error
	}
}
