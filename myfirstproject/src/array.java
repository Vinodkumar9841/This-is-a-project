public class array {
  public static void main(String[] args) {
    int [] j={2,5,1,9,7 };
    int max = j[0];
    int index =0;

    
    for(int i = 0;i<j.length;i++){
      if(j[i]>max){ 
      max=j[i];
      index=i;
      }

     
    }
    System.out.println("the maximum number is"+max+"at index"+index+".");
  }

  
}
