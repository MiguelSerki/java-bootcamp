package topic3.exercise1;

public class Converter {

	private int intToConvert;
	private String[] singles = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private String tens[] = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen",
			"nineteen" };
	private String decens[] = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private String convertedInt;

	public Converter(int i) {
		this.intToConvert = i;
	}

	public String convert() {

		if (this.intToConvert < 20) {
			if (this.intToConvert < 10) {
				this.convertedInt = this.singles[intToConvert - 1];
			} else {
				this.convertedInt = this.tens[intToConvert - 10];
			}
		} else {
			if (this.intToConvert < 30) {
				this.convertedInt = this.decens[0].concat("-").concat(this.singles[this.intToConvert - 21]);
			} else if (this.intToConvert < 40) {
				this.convertedInt = this.decens[1].concat("-").concat(this.singles[this.intToConvert - 31]);
			} else if (this.intToConvert < 50) {
				this.convertedInt = this.decens[2].concat("-").concat(this.singles[this.intToConvert - 41]);
			} else if (this.intToConvert < 60) {
				this.convertedInt = this.decens[3].concat("-").concat(this.singles[this.intToConvert - 51]);
			} else if (this.intToConvert < 70) {
				this.convertedInt = this.decens[4].concat("-").concat(this.singles[this.intToConvert - 61]);
			} else if (this.intToConvert < 80) {
				this.convertedInt = this.decens[5].concat("-").concat(this.singles[this.intToConvert - 71]);
			} else if (this.intToConvert < 90) {
				this.convertedInt = this.decens[6].concat("-").concat(this.singles[this.intToConvert - 81]);
			} else if (this.intToConvert < 100) {
				this.convertedInt = this.decens[7].concat("-").concat(this.singles[this.intToConvert - 91]);
			}
		}

		return convertedInt;
	}

}
