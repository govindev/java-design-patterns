package miscellenious.chainofresponsibility;

public class Director extends Employee {
    public Director(Employee sucdessor) {
        super("Director", sucdessor);
    }

    @Override
    public boolean processRequest(LeaveApplication leaveApplication) {
        leaveApplication.approve(getApproverRole());
        return true;
    }
}
