import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileConnect {
	String fileName = "Sonets.txt";
	File file = new File(fileName);
	FileReader fr = null;
	String outSonet = "";

	public String GetSonet() {

		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String separator = "*";
			int countOfSonets = 8;

			Random rand = new Random();
			int random = rand.nextInt((countOfSonets - 1) +1) + 1;
			int count = 0;
			

			while ((line = br.readLine()) != null) {
				if (line.contains(separator))
					count+=1;
				if (count == random) {
					line = br.readLine();
					while (!line.contains(separator)) {
						String[] arr = line.split(" ");

							for (String word : arr) {
								outSonet=outSonet.concat(word+" ");
						}
							outSonet=outSonet.concat("\n");
						line = br.readLine();
					}
					break;
				}

			}

			br.close();
			

		} catch (FileNotFoundException ex) {
			System.out.println("File not found!");
		} catch (IOException exc) {
			System.out.println("Input-output exception!");
		} finally {
			try {
				fr.close();
			} catch (IOException ex) {
				System.out.println("Input-output exception!");
			}
		}
		System.out.println(outSonet);
		return outSonet;
	}
}
