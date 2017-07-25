package topic3;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class _RomanConversion {

	@Test
	public void test1toI() {
	
		Arabic arabic = new Arabic(1);
		Roman roman = new Roman (arabic.convertToRoman());
		assertEquals ("I", arabic.convertToRoman());
	}

	@Test
	public void test2toII() {
		Arabic arabic = new Arabic(2);
		assertEquals ("II", arabic.convertToRoman());
	}
	@Test
	public void test3toIII() {
		Arabic arabic = new Arabic(3);
		assertEquals ("III", arabic.convertToRoman());
	}
}
