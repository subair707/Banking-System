import java.util.ArrayList;
class Main {


    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();


        Account su = new Account("Subair", 300.00);
        Account ab = new Account("Soonup", 30000.00);
        accounts.add(su);
        accounts.add(ab);
        accounts.get(0).displayAccountInfo();
        accounts.get(1).displayAccountInfo();



    }
}