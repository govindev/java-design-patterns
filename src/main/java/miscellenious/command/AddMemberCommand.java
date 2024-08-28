package miscellenious.command;

public class AddMemberCommand implements Command {
    private final String firstName;
    private final String emailAddress;
    private final EWSService ewsService;

    public AddMemberCommand(String firstName, String emailAddress, EWSService ewsService) {
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.ewsService = ewsService;
    }

    public void execute() {
        ewsService.addMember(firstName, emailAddress);
    }
}
