class Main{

    public static void main(String[] args) {
        Account su = new Account("Subair", 200.00);
        su.deposite(-1);
        System.out.println(su.displayBalance());
        su.withdraw(-20);
       // System.out.println(su.displayBalance());
        su.displayAccountInfo();

    }
}