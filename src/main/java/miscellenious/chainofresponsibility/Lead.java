package miscellenious.chainofresponsibility;

public class Lead extends Employee {

    public Lead(Employee successor) {
        super("Lead", successor);
    }

    public boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.type == LeaveApplication.Type.Sick && leaveApplication.numberOfDays <= 2) {
            leaveApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
