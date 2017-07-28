package topic3.exercise4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class _RomanConversion {

	@Test
	public void test1toI() {
	
		Arabic arabic = new Arabic(1);
		List<String> romans = new ArrayList<String>();
		romans.add("I");
		assertEquals (romans, arabic.getRoman());
	}

	@Test
	public void test7() {
		Arabic arabic = new Arabic(7);
		List<String> romans = new ArrayList<String>();
		romans.add("V");
		romans.add("I");
		romans.add("I");
		assertEquals (romans, arabic.getRoman());
	}
	@Test
	public void test19() {
		Arabic arabic = new Arabic(19);
		List<String> romans = new ArrayList<String>();
		romans.add("X");
		romans.add("V");
		romans.add("I");
		romans.add("I");
		romans.add("I");
		romans.add("I");
		assertEquals (romans, arabic.getRoman());
	}
	@Test
	public void test1256() {
		Arabic arabic = new Arabic(1256);
		List<String> romans = new ArrayList<String>();
		romans.add("M");
		romans.add("C");
		romans.add("C");
		romans.add("L");
		romans.add("V");
		romans.add("I");
		assertEquals (romans, arabic.getRoman());
	}
}
