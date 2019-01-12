package day03;

/**
 * ATM类，提供取钱和存钱功能
 * @author actstrady
 */
public class ATM {
    private String accountNum;
    private long money;

    public ATM(String accountNum, long money) {
        this.accountNum = accountNum;
        this.money = money;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "accountNum='" + accountNum + '\'' +
                ", money=" + money +
                '}';
    }

    // 存钱
    public long deposit(long addMoney) {
        return addMoney + money;
    }

    // 取钱
    public long draw(long drMoney) {
        return money - drMoney;
    }
}
