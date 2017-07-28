package topic3.exercise2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class _WordWrappingTest {

	@Test
	public void HelloTwoRows() {

		List<String> hello = new ArrayList<String>();
		hello.add("he");
		hello.add("ll");
		hello.add("o");
		WordWrapping wrapper = new WordWrapping(2, "hello");
		assertEquals(hello, wrapper.getList());
	}

	@Test
	public void HelloTrheeRows() {

		List<String> hello = new ArrayList<String>();
		hello.add("hel");
		hello.add("lo");
		WordWrapping wrapper = new WordWrapping(3, "hello");
		assertEquals(hello, wrapper.getList());
	}

	@Test
	public void largerWordFourRows() {

		List<String> hello = new ArrayList<String>();
		hello.add("supe");
		hello.add("rcal");
		hello.add("ifra");
		hello.add("gili");
		hello.add("stic");
		hello.add("");
		WordWrapping wrapper = new WordWrapping(4, "supercalifragilistic");
		assertEquals(hello, wrapper.getList());
	}
}
