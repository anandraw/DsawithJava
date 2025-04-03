package TestingShastra;

public class Account {
    String accountNo;

    public  Account(String ac){
        accountNo = ac;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public static void main(String[] args) {
        Account a = new Account("24");
        System.out.println(a.accountNo);
        a.setAccountNo("23");
        System.out.println(a.getAccountNo());
    }
}
