package miscellenious.chainofresponsibility;

public class Manager extends Employee {
    public Manager(Employee successor) {
        super("Manager", successor);
    }

    @Override
    public boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.type == LeaveApplication.Type.Sick
                || leaveApplication.type == LeaveApplication.Type.PTO && leaveApplication.numberOfDays <= 5) {
            leaveApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
