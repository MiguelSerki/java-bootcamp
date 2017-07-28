package topic3.exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class _converterTest {

	// Convert an amount on a check to appropiate text. For example:
	// 2523.04 --> Two thousand five hundred twenty-three and 04/100 dollars
	@Test
	public void convert_1_To_One() {
		Converter converter = new Converter(1);
		assertEquals("one", converter.convert());
	}

	@Test
	public void convert_2_To_Two() {
		Converter converter = new Converter(2);
		assertEquals("two", converter.convert());
	}

	@Test
	public void convert_3_To_Three() {
		Converter converter = new Converter(3);
		assertEquals("three", converter.convert());
	}

	@Test
	public void convert_8_To_Eight() {
		Converter converter = new Converter(8);
		assertEquals("eight", converter.convert());
	}

	@Test
	public void convert_12_To_Twelve() {
		Converter converter = new Converter(12);
		assertEquals("twelve", converter.convert());
	}

	@Test
	public void convert_19_To_Nineteen() {
		Converter converter = new Converter(19);
		assertEquals("nineteen", converter.convert());
	}

	@Test
	public void convert_23_To_TwentyThree() {
		Converter converter = new Converter(23);
		assertEquals("twenty-three", converter.convert());
	}

	@Test
	public void convert_48_To_FortyEight() {
		Converter converter = new Converter(48);
		assertEquals("forty-eight", converter.convert());
	}

	@Test
	public void convert_56() {
		Converter converter = new Converter(56);
		assertEquals("fifty-six", converter.convert());
	}

	@Test
	public void convert_99() {
		Converter converter = new Converter(99);
		assertEquals("ninety-nine", converter.convert());
	}
}
