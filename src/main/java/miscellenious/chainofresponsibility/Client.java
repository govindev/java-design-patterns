package miscellenious.chainofresponsibility;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        Lead lead = new Lead(manager);
        LeaveApplication leaveApplication = new LeaveApplication(LocalDate.now(), LocalDate.now(), LeaveApplication.Type.Sick);
        lead.processLeaveApplication(leaveApplication);
        System.out.println(leaveApplication);
    }
}
