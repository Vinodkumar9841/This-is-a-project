import java.util.Scanner;

public class even {
  public static void main(String[] args) {
  Scanner vinod = new Scanner (System.in);
  int number ;
  System.out.println("enter the number to check");
  number = vinod.nextInt();
  if(number %2==0){
    System.out.println("given number is even");
  }
  else{
    System.out.println("given number is odd");
  }

  }
  
}
