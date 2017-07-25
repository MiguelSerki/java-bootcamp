package topic3.exercise1;

import java.util.ArrayList;

public class Converter {

	private int intToConvert;
	private String convertedInt;

	public Converter(int i) {
		this.intToConvert = i;
	}

	public String convert() {

		if (this.intToConvert == 1) {
			convertedInt = "one";
		} else {
			convertedInt = "two";
		}

		return convertedInt;
	}

}
