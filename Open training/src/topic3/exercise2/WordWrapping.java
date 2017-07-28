package topic3.exercise2;

import java.util.ArrayList;
import java.util.List;

public class WordWrapping {

	private int rowLenght;
	private String word;
	private List<String> list;

	public WordWrapping(int i, String string) {
		this.rowLenght = i;
		this.word = string;
		this.list = new ArrayList<String>();
		list.add(this.wrap(string, 0));
	}

	public String wrap(String string, int temp) {
		if (string.isEmpty()) {
			return "0";
		} else {
			int b = temp;
			int i = this.rowLenght;
			if (b + i > this.word.length()) {
				i = this.word.length();
				return this.word.substring(b, i);
			}
			list.add(wrap(this.word.substring(b, i + b), b + i));
			return this.word.substring(b, i + b);
		}

	}

	public List getList() {

		List invertedList = new ArrayList();
		for (int i = this.list.size() - 1; i >= 0; i--) {
			invertedList.add(this.list.get(i));
		}
		return invertedList;
	}
}