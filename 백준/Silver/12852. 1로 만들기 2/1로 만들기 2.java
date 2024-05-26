import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] D = new int[N + 1];
    int[] pre = new int[N + 1];
    D[1] = 0;
    
    for(int i = 2; i <= N; i++){
      D[i] = D[i - 1] + 1;
      pre[i] = i - 1;
      if(i % 2 == 0 && D[i] > D[i / 2] + 1){
        D[i] = D[i / 2] + 1;
        pre[i] = i / 2;
      }
      if(i % 3 == 0 && D[i] > D[i / 3] + 1){
        D[i] = D[i / 3] + 1;
        pre[i] = i / 3;
      }
    }

    System.out.println(D[N]);
    while(N > 0){
      System.out.print(N + " ");
      N = pre[N];
    }
    sc.close();
  }
}