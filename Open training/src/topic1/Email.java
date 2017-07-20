package topic1;

public class Email {

	private String text;
	
	public Email (String text) {
		this.text = text;
	}
	public void readEmail () {
		System.out.println(text);
	}
	public void setEmail (String text) {
		this.text = text;
	}
}
