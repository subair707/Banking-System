
import java.util.ArrayList;

class Bank {
  private ArrayList<Account> accounts;
    

    Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
