package topic3.exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class _converterTest {

	// Convert an amount on a check to appropiate text. For example:
	//2523.04 --> Two thousand five hundred twenty-three and 04/100 dollars
	@Test
	public void convert_1_To_One() {
		Converter converter = new Converter(1);
		assertEquals ("one", converter.convert());
	}

	@Test
	public void convert_2_To_Two() {
		Converter converter = new Converter(2);
		assertEquals ("two", converter.convert());
	}
	
	@Test
	public void convert_3_To_Three() {
		Converter converter = new Converter(3);
		assertEquals ("three", converter.convert());
	}
}
