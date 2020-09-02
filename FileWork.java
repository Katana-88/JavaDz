import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWork {

	public static void main(String[] args) {

		String dirname = System.getProperty("user.dir") + "/testDir";
		File dir = new File(dirname);
		dir.mkdir();
		
		String fileName = "test.txt";
		String fullName = "";
		fullName = dirname + File.separator + fileName;
		File file = new File(fullName);
		if ( !file.exists()){
			try {
				if( file.createNewFile() )
					System.out.println("File created!");
				else
					System.out.println("Something Wrong!");
				} 
			catch (IOException ex) {
				System.out.println(ex.toString());
				}
			} else{
				System.out.println("File already exists!");
				}
		
		FileReader fr = null;
		FileWriter fw = null;
		try {			
			fw = new FileWriter(file);
			fw.write("alfa beta gamma delta omega"+System.getProperty("line.separator")+
					"monday tuesday wednesday thursday friday saturday sunday"+System.getProperty("line.separator")+
					"single"+System.getProperty("line.separator")+
					"summer fall winter spring"+System.getProperty("line.separator"));
			System.out.println("Text is already added.");
			fw.close();
			
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line="";
			while((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				if(arr.length>1)
				{
					String tmp = arr[0];
					arr[0] = arr[arr.length-1];
					arr[arr.length-1] = tmp;
					for (String word : arr) {
					    System.out.print(word + " ");
					    }
					  System.out.println();
					}
				else {
					System.out.println(line);
				}
				}
			
			br.close();
			
			} catch (FileNotFoundException ex) {
				System.out.println("File not found!");
				} catch (IOException ex) {
					System.out.println("Input-output exception!");
					} finally {
						try {
							fr.close();
							} catch (IOException ex) {
								System.out.println("Input-output exception!");
								}
						}
	}
}
