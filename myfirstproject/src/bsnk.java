public class bsnk {
  static int currentBalance =1000;
  public static void greetCustomer(){
    System.out.println("hello,welcome to the banking application ");
  }
  public void deposit( int amount){
    currentBalance =currentBalance+amount;
    System.out.println("amount is deposited succesfully");


  }
  public  static void withdrawal( int amount){
    currentBalance =currentBalance-amount;
    System.out.println("amount is withdrawn successfully");


  }
  public int getCurrentBalance(){
    return currentBalance;

  }

    public static void main(String[] args) {
      bsnk bank =new bsnk ();
   greetCustomer();System.out.println("current balance is :"+bank.getCurrentBalance());
    

   
   bank.deposit(500);
System.out.println("current balance is :"+bank.getCurrentBalance());
   withdrawal(300);
      System.out.println("current balance is :"+bank.getCurrentBalance());
    
    
  }
  
}
