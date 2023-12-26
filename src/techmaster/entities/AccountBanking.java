package techmaster.entities;

public class AccountBanking {
    private int id;
    private static int autoId = 0;
    private String accountNumber;
    private String accountName;

    public AccountBanking( String accountNumber, String accountName) {
        this.id = ++autoId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
}
