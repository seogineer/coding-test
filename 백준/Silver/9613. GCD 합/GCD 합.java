import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = Integer.parseInt(sc.nextLine());
    
    StringBuilder sb = new StringBuilder();
    for(int t = 0; t < tc; t++){
      int n = sc.nextInt();
      int[] input = new int[n];
      for(int i = 0; i < n; i++){
        input[i] = sc.nextInt();
      }

      long sum = 0;
      for(int i = 0; i < input.length - 1; i++){
        for(int j = i + 1; j < input.length; j++){
          sum += gcd(input[i], input[j]);
        }
      }
      sb.append(sum).append("\n");
    }
    System.out.println(sb);
    sc.close();
  }

  private static int gcd(int left, int right){
    for(int i = Math.min(left, right); i > 0; i--){
      if(left % i == 0 && right % i == 0){
        return i;
      }
    }
    return 0;
  }
}