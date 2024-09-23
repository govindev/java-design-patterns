package miscellenious.flyweight;

import java.time.Duration;

public class UserBannedErrorMessage implements ErrorMessage {

    private String caseId;
    private String remarks;
    private Duration banDuration;
    private String msg;

    public UserBannedErrorMessage(String caseId) {
        this.caseId = caseId;
        remarks = "You voilated terms of use.";
        banDuration = Duration.ofDays(2);
        msg = "You are BANNED. Sorry. \n More information: \n";
        msg += caseId +"\n";
        msg += remarks +"\n";
        msg += "Banned For: " + banDuration.toHours() + "Hours";
    }

    @Override
    public String getText(String code) {
        return msg;
    }

    public String getCaseId() {
        return caseId;
    }
}
