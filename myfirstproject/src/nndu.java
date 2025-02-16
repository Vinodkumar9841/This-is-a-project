public class nndu {

  public static void main(String[] args) {
    String examStatus ="pass";
    if(examStatus=="pass"){
      System.out.println("please wait for the next round");
      String round1Status ="pass";
      if(round1Status=="pass"){
        System.out.println("please wait for the 2nd round");
        String round2Status ="pass";
        if(round2Status=="pass"){
          System.out.println("please wait for the HR round");
        }
      }
      else{
        System.out.println("you can go home");
      }
     
    }
    else{
      System.out.println("you can go home");
    }
    
   
  }
  
}

    
