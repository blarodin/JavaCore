package ua.com.codefire._08_classes_adv.bank;

import java.util.Date;

public class Passport {

    private String number;
    private Date expireDate;

    public Passport(String number, Date expireDate) {
        this.number = number;
        this.expireDate = expireDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
