package dummy;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        EWSService ewsService = new EWSService();
        Command c1 = new AddMemberCommand("govind", "c2@gmail.com", ewsService);
        MailTaskRunner.getInstance().addCommand(c1);


        Command c2s = new AddMemberCommand("govind", "c2@gmail.com", ewsService);
        MailTaskRunner.getInstance().addCommand(c2s);

        Thread.sleep(3000);
        MailTaskRunner.getInstance().shutdown();

    }

}
