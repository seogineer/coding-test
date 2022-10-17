import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean[] prime = new boolean[1000001];
    Arrays.fill(prime, true);
    isPrime(prime);
    
    int input;
    while(true) {
      input = Integer.parseInt(sc.nextLine());

      if(input < 4){
        break;
      }
      
      boolean flag = false;
      for(int i = 3; i <= prime.length; i++){
        if(prime[i] && prime[input - i]){
          System.out.println(input + " = " + i + " + " + (input - i));
          flag = true;
          break;
        }
      }

      if(!flag){
        System.out.println("Goldbach's conjecture is wrong.");
      }
    }
    sc.close();
  }

  private static void isPrime(boolean[] prime){
    prime[0] = prime[1] = false;
    for(int i = 3; i < 1000001; i++){
      if(!prime[i]){ continue; }
      for(int j = i + i; j < 1000001; j += i){
        prime[j] = false;
      }
    }
  }
}