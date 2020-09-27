import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestForString {
	
	public static String s ="";

	@Test
	void TestForStringWithRepeats() {
		s = "Afternoon";
		ArrayList<String> out = new ArrayList<String> ();
		out.add("Aefnort");
		ArrayList<String> res = StringSymbols.getStringSymbols(s);
		
		assertEquals(res, out);
	}

	@Test
	void TestForStringWithoutRepeats() {
		s = "Company";
		ArrayList<String> out = new ArrayList<String> ();
		out.add("Camnopy");
		ArrayList<String> res = StringSymbols.getStringSymbols(s);
		
		assertEquals(res, out);
	}
	
	@Test
	void TestForStringWithSpaceOnly() {
		s = "                   ";
		ArrayList<String> res = StringSymbols.getStringSymbols(s);
		assertEquals(res, null);
	}
	
	@Test
	void TestForStringWithNull() {
		ArrayList<String> res = StringSymbols.getStringSymbols(null);
		assertEquals(res, null);
	}

}
