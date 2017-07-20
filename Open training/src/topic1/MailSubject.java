package topic1;

public interface MailSubject {
	void addObserver(MailObserver mailObserver);
	void removeObserver(MailObserver mailObserver);
	void doNotify();
}
