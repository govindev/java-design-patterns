package facade.begin.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
