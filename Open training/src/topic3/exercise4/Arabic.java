package topic3;

import java.util.List;

public class Arabic {

	private int arabic;
	private Roman roman;

	public Arabic(int i) {
		this.arabic = i;
		Roman roman = new Roman(null);
		this.roman = roman;
	}

	public String convertToRoman() {

		int temp = this.arabic;
		while (temp >0) {
			if (temp == 1) {
				this.roman.setRoman("I");
			}
			if (temp == 2) {
				this.roman.setRoman("II");
			}
			temp--;
			return roman.getRoman();
		}
	}

}
