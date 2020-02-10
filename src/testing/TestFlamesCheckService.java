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
		int temp = 0;
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "Anand";
		name2 = "Lavanya";
		temp = 2;
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "jothivel";
		name2 = "jegajothivel";
		temp = 4;
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "priyadharshini";
		name2 = "karthikeyan";
		temp = 3;
		assertEquals(temp,fcs.findFlames(name1, name2));
		name1 = "bhuvaneswari";
		name2 = "gayathri";
		temp = 1;
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
