import java.util.Scanner;

public class studentscore {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("enter the student score");
    int score = scanner.nextInt();
    if(score<35){
      System.out.println("the student is failed");

    

      }
      else if (score==35){
        System.out.println("studet is pass");
      }
      else if (score>35&&score<70){
      System.out.println("student secured c grade");
      }
      else if (score>70&&score<85){
        System.out.println("student secured b grade ");
      }
      else if (score>85){
        System.out.println("student secured c grade ");
      }
    
  
  



      
      

      
    }
  }

