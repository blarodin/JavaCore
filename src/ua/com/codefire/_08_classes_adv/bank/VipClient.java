package ua.com.codefire._08_classes_adv.bank;

public class VipClient extends AbsClient {

    private boolean overdraft;

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }
}
