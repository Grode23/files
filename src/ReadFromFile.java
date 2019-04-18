import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFromFile {

	ObjectInputStream input;

	public void openFile() {

		try {
			InputStream in = Files.newInputStream(Paths.get("file.ser"));
			input = new ObjectInputStream(in);

			System.out.println("File is opened for reading");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void readRecords() {

		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "Name", "Surname", "Balance");

		ArrayList<Account> records = new ArrayList<>();
		int lastIndex = 0;

		while (true) {

			try {
				records.add((Account) input.readObject());

				System.out.println(records.get(lastIndex).toString());

				lastIndex++;

			} catch (EOFException e) {
				break;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void closeFile() {
		try {
			if (input != null)
				input.close();
			
			System.out.println("No more reading.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
