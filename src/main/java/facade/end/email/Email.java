package facade.end.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
