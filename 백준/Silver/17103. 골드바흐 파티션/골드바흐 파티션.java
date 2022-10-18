import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int tc = Integer.parseInt(sc.nextLine());
    for(int t = 0; t < tc; t++){
      int input = sc.nextInt();
      boolean[] prime = new boolean[input + 1];  
      Arrays.fill(prime, true);
      getPrime(prime, input);

      int count = 0;
      for(int i = 2; i <= input / 2; i++){
        if(prime[i] && prime[input - i]){
          count++;
        }
      }
      System.out.println(count);
    }
    sc.close();
  }

  private static void getPrime(boolean[] prime, int input){
    prime[0] = prime[1] = false;
    for(int i = 2; i <= input; i++){
      if(!prime[i]){
        continue;
      }
      for(int j = i + i; j <= input; j += i){
        prime[j] = false;
      }
    }
  }
}