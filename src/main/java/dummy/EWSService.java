package dummy;

public class EWSService {
    public void addMember(String firstName, String emailAddress) {
        System.out.println("Adding user with first name : " + firstName + ", and email address : " + emailAddress);
    }

    public void removeMember(String firstName, String emailAddress) {
        System.out.println("Removing user with first name : " + firstName + ", and email address : " + emailAddress);
    }
}
