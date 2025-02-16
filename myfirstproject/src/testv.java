public class testv {
  int i =10;
  int j =10;
  public testv(){
    i = 10;
    j = 20;
  
    
  
  }
  public testv (int i,int j){
    this.i=i;
    this.j=j;

  }
  public static void main(String[] args) {
    testv t1 = new testv();
    testv t2 = new testv(15,20);
    testv t3 = new testv(30,90);
    System.out.println(t1.add());
    System.out.println(t2.add());
    System.out.println(t3.add());
    System.out.println(t1==t2);
    System.out.println(t2==t3);
    
    
  }
  public int add() {
    return i+j;

  }
}
