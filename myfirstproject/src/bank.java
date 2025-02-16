public class bank {


  static int currentBalance = 1000;
  public static void greetcustomer(){
    System.out.println("hello welcome to the banking application");

  }
  public void deposite(int amount){
    currentBalance = currentBalance + amount;
    System.out.println("Amount is deposited successfully");

  }
  public static void withdrwal(int amount){
    currentBalance = currentBalance - amount;
    System.out.println("Amount is withdrwan successfully");

  }
  public  int getCurrentBalance(){
    return currentBalance;

  }

public static void main(String[] args) {
  bank Vinod = new bank();
  greetcustomer();
  System.out.println("current balance is :"+Vinod.getCurrentBalance());
  Vinod.deposite(400);
  System.out.println("current balance is :"+Vinod.getCurrentBalance());
  withdrwal(300);
  System.out.println("current balance is :"+Vinod.getCurrentBalance());
  

  
 
 
}
}

