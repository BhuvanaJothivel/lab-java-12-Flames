package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import service.FlamesCheckService;

public class TestFlamesCheckService {
	FlamesCheckService fcs = new FlamesCheckService();
	@Test
	public void testFindFlamesMethod() {
		String name1 = "bhuvana";
		String name2 = "abarna";
		char temp = 'f';
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "Anand";
		name2 = "Lavanya";
		temp = 'm';
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "bhuvaneswari";
		name2 = "abarna";
		temp = 'a';
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "priyadharshini";
		name2 = "karthikeyan";
		temp = 3;
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "bhuvana";
		name2 = "gayathri";
		temp = 'e';
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "acxdgjikz";
		name2 = "b";
		temp = 'l';
		assertEquals(temp,fcs.findFlames(name1, name2));
		
		try {
			fcs.findFlames(null, null);
			fcs.findFlames("AAA", null);
			fcs.findFlames(null, "BBB");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
