package topic3.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Arabic {

	private List<String> roman;

	public Arabic(int i) {
		roman = new ArrayList<String>();
		this.convertToRoman(i);
	}

	public int convertToRoman(int number) {

		if (number >= 1000) {
			roman.add("M");
			return (this.convertToRoman(number - 1000));
		} else {
			if (number >= 500) {
				roman.add("D");
				return (this.convertToRoman(number - 500));
			} else {
				if (number >= 100) {
					roman.add("C");
					return (this.convertToRoman(number - 100));
				} else {
					if (number >= 50) {
						roman.add("L");
						return (this.convertToRoman(number - 50));
					} else {
						if (number >= 10) {
							roman.add("X");
							return (this.convertToRoman(number - 10));
						} else {
							if (number >= 5) {
								roman.add("V");
								return (this.convertToRoman(number - 5));
							} else {
								if (number >= 1) {
									roman.add("I");
									return (this.convertToRoman(number - 1));
								} else {
									if (number == 0) {
										return 0;
									}
								}
							}
						}
					}
				}
			}
		}
		return number;
	}

	public List<String> getRoman() {
		return this.roman;

	}

}
