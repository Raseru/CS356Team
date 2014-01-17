package benchmarks.testcases;


class Account {
  double balance;
  int id;

  void withdraw(double amount){
     balance -= amount;
  } 

  void deposit(double amount){
     balance += amount;
  } 

   void transfer(Account from, Account to, double amount){
        sync(from);
        sync(to);
           from.withdraw(amount);
           to.deposit(amount);
        release(to);
        release(from);
    }

}
