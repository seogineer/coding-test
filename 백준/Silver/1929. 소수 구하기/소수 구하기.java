import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    boolean[] prime = new boolean[N + 1];
    prime(prime, N);

    for(int i = M; i <= N; i++){
      if(!prime[i]){
        System.out.println(i);
      }
    }
    
    sc.close();
  }

  private static void prime(boolean[] prime, int N){
    prime[0] = prime[1] = true;
    for(int i = 2; i <= Math.sqrt(N); i++){
      if(prime[i]){
        continue;
      }
      for(int j = i + i; j <= N; j += i){
        prime[j] = true;
      }
    }
  }
}