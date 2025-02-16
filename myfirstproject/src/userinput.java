import java.util.Scanner;

public class userinput {

  public static void main(String[] args) {
    Scanner scanner =new Scanner (System.in);
    System.out.println("what is your name");
    String name = scanner .nextLine();
    System.out.println("hey %s , how are you? \n " );
    String status = scanner .nextLine();
    System.out.println("what is your age? \n");
    int age = scanner.nextInt();
    System.out.println("thank you for the information");




  }
  
}
