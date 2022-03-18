package day0308;

public class TestAccount {
    String accNo;
    int balance;

    public static void main(String[] args) {
        Account account = new Account("", 0);
        account.setAccNo("078-3762-292");
        System.out.println(account.getAccNo() + " 계좌의 잔고는 " + account.getBalance()+ "만원 입니다.");
        account.setBalance(100);
        System.out.println(account.getAccNo() + " 계좌의 잔고는 " + account.getBalance()+ "만원 입니다.");
        account.deposit(30);
        System.out.println(account.getAccNo() + " 계좌의 잔고는 " + account.getBalance()+ "만원 입니다.");

    }
}
