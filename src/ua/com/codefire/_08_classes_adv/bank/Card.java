package ua.com.codefire._08_classes_adv.bank;

public class Card {

    private int[][] cardNumber = new int[4][4];
    private int cardMonth;
    private int cardYear;
    private double money;

    public Card(int[][] cardNumber, int cardMonth, int cardYear, double money) {
        this.cardNumber = cardNumber;
        this.cardMonth = cardMonth;
        this.cardYear = cardYear;
        this.money = money;
    }

    public int[][] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int[][] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardMonth() {
        return cardMonth;
    }

    public void setCardMonth(int cardMonth) {
        this.cardMonth = cardMonth;
    }

    public int getCardYear() {
        return cardYear;
    }

    public void setCardYear(int cardYear) {
        this.cardYear = cardYear;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
