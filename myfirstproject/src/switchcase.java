import java.util.Scanner;

public class switchcase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("press 1 for order pizza");
    System.out.println("press 2 for dosa ");
    System.out.println("enter your choice");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
      System.out.println("thanks for ordering pizza");
        
        break;
        case 2:
        System.out.println("thanks for ordering dosa");
        break;
    
      default:
      System.out.println("invalid choice");
        break;
    }
  }
  
}
