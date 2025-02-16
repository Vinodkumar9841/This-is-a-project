import java.util.Scanner;

public class vinnu {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    System.out.println("enter a number");
    int a = kb.nextInt();
   switch(a%2){
    case 1:
    System.out.println(a+"is odd number");
    break;
    default:
    System.out.println(a+"is even number");
    
   }
  }
}
