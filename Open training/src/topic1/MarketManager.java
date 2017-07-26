package topic1;

public class MarketManager implements MailObserver {

	@Override
	public void doUpdate(Email email) {
		System.out.println("The manager has recibed an email:");
		email.readEmail();
	}

	
}
