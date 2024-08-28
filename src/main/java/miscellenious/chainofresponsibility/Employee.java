package miscellenious.chainofresponsibility;

public abstract class Employee implements LeaveApprover {

    private final Employee successor;
    private final String role;

    public Employee(String role, Employee successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!processRequest(leaveApplication) && successor != null) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    public abstract boolean processRequest(LeaveApplication leaveApplication);

    @Override
    public String getApproverRole() {
        return this.role;
    }
}
