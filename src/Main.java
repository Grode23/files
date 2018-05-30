
public class Main {

	public static void main(String[] args) {
		ReadFromFile reader = new ReadFromFile();
		WriteToFile writer = new WriteToFile();
		
		
		reader.openFile();
		reader.readRecords();
		reader.closeFile();
		
		writer.openFile();
		writer.addRecords();
		writer.closeFile();
		
	}


}
