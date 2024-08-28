package miscellenious.chainofresponsibility;

import java.time.LocalDate;
import java.time.Period;

public class LeaveApplication {
    enum Type { PTO, Sick, Vacation };
    private enum Status { PENDING, APPROVED, REJECTED };

    public Type type;
    public Status status;

    public LocalDate from;
    public LocalDate to;
    public int numberOfDays;
    public String processedBy;

    public LeaveApplication(LocalDate from, LocalDate to, Type type) {
        this.type = type;
        this.numberOfDays = Period.between(from, to).getDays();
        this.status = Status.PENDING;
    }

    public void approve(String processedBy) {
        this.status = Status.APPROVED;
        this.processedBy = processedBy;
    }

    @Override
    public String toString() {
        return type + " leave for " + numberOfDays + " days " + status + " by " + processedBy;
    }
}
