package techmaster.entities;

public class AccountBanking {
    private int id;
    private static int autoId;
    private String accountNumber;
    private String accountName;


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
