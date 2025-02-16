public class primeloop {
  
    public static void main(String[] args) {
        int num = 200;
        while (num <= 500) {
            boolean isPrime = true;
            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime && num > 1) {
                System.out.println(num);
                          }
            num++;
        }
    }
}

  
}
