package miscellenious.chainofresponsibility;

public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication leaveApplication);
    String getApproverRole();
}
