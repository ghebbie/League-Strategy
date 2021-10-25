import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ChampList{
	public static ArrayList<Champion> champs = _makeChamps();
	
	public static ArrayList<Champion> _makeChamps(){
		ArrayList<Champion> champs = new ArrayList<>();
		String fileName = "ChampList.txt";
		try{
			File textFile = new File(fileName);
			Scanner reader = new Scanner(textFile);
			while(reader.hasNextLine()){
				String line = reader.nextLine();
				String[] data = line.split(", " , 2);
				ChampClass c = ClassList.getChampClass(data[1]);
				champs.add(new Champion(data[0], c));
			}
			return champs;
		} catch(FileNotFoundException e){
			System.out.println("File " + fileName + " not found");
			return null;
		}
	}
}
