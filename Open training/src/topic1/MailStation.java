package topic1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MailStation implements MailSubject {

	private Set<MailObserver> mailObserver;
	private Email email;

	public MailStation() {
		mailObserver = new HashSet<MailObserver>();
	}

	@Override
	public void addObserver(MailObserver mailObserver) {
		this.mailObserver.add(mailObserver);
	}

	@Override
	public void removeObserver(MailObserver mailObserver) {
		this.mailObserver.remove(mailObserver);
	}

	@Override
	public void doNotify() {
		Iterator<MailObserver> it = mailObserver.iterator();
		while (it.hasNext()) {
			MailObserver mailObserver = it.next();
			mailObserver.doUpdate(this.email);
		}
	}

	public void sendEmail(Email email) {
		this.email = email;
		this.doNotify();
	}
	
	public Set<MailObserver> getMailObserver() {
		return mailObserver;
	}

	public void setMailObserver(Set<MailObserver> mailObserver) {
		this.mailObserver = mailObserver;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

}
