import java.util.ArrayList;
import java.util.Arrays;



public class StringSymbols {
	
	public static ArrayList<String> getStringSymbols(String text){
		if(text==null)
		{
			System.out.println("Null string.");
			return null;
		}
		text=text.trim();
		if(text.length()==0) {
			System.out.println("Empty string.");
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<text.length(); i++) {
			String si = text.substring(i, i + 1);
	        if (sb.indexOf(si) == -1) {
	            sb.append(si);
	        }
		}
		text=sb.toString();
		char[] arr = text.toCharArray();
		Arrays.sort(arr);
		ArrayList<String> result = new ArrayList<String>();
		String out = new String(arr);
		result.add(out);
		return result;
	}

	public static void main(String[] args) {
		String hw = "Hello, World!";
		ArrayList<String> show = getStringSymbols(hw);
		if(show != null)
		{
			show.forEach(ñ->System.out.println(ñ));
		}
	}

}
