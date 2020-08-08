
public class EqualPass {

	public static void main(String[] args) {
		
		String patternPassword = "Qwerty123456";
		
		for (int i = 0 ; i < args.length ; i++) {
			
			System.out.println(args[i].equals(patternPassword));
			
		}	
	}

}
