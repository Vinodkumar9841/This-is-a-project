import java.util.Scanner;

public class vkzzz {
  public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    System.out.println("enter 2 nd number");
    int b = sc.nextInt();
    char operation = sc.next().charAt(0);
    switch(operation){
      case '+':
      System.out.println(a+b);
      break;
      case '-':
      System.out.println(a-b);
      break;
      case '*':
      System.out.println(a*b);
      break;
      case '/':
      System.out.println(a/b);
      break;
      default:
      System.out.println("entered invalid");
      break;




    }
  
  }
  
}
