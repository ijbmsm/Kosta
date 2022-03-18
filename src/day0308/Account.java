package day0308;

public class Account {
    private String accNo;
    private int balance;
    private int useMoney;

    public Account(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(getAccNo() + " 계좌가 개설되었습니다.");

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println(getAccNo() + " 계좌에 " + balance + "만원이 입급되었습니다.");
    }
    public int deposit(int useMoney){
        System.out.println(getAccNo() + " 계좌에 " + useMoney + "만원이 출금되었습니다.");
        balance -= useMoney;
        return balance;
    }
}

