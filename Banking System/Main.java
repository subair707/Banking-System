class Main {


    public static void main(String[] args) {
       //ArrayList<Account> accounts = new Arraylist<>;




        Account su = new Account("Subair", 300.00);
        Account ab = new Account("Soonup", 30000.00);
        //account.add(su);
        //accounts.add(ab);
        //accounts.get(0).displayAccountInfo();
        //accounts.get(1).displayAccountInfo();

       // for(Account account: accounts) {
       //     account.displayAccountInfo();
       // }

        Bank bank = new Bank();
        bank.addAccount(su);
        bank.addAccount(ab);
        

    }
}