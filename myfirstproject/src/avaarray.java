public class avaarray {
  public static void main(String[] args) {
    int [] j={2,5,3,9,6};
    int sum = 0;
    int avg = 0;
    
    
    for(int i =0; i<j.length;i++){
      sum =sum +j[i];
      
      avg=sum /j.length;

    }
    System.out.println("avg"+avg);
    
  }
  
}
