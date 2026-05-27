class Account{

   private String name;
   private double balance; 

   public Account(String name, double balance) {

     this.name = name;
     this.balance = balance;

   }

   public void deposite(double amount) {
     if(amount < 0) {
      System.out.println("Invalid for deposite of N");
     }
     
     else {balance += amount;
     }
   }

   public double displayBalance() {
     return balance;

   }

   public void withdraw(double amount) {
     if(amount < 0) {
      System.out.println("Invalid for withdraws of N");
     }

     else if(balance < amount) {
      System.out.println("insufficent funds");
     }
     else {balance -= amount;
     }
   }

   public void displayAccountInfo() {
     System.out.println("Account Holder: " + name );
     System.out.println("Balance: " + balance );

   }
}
    

