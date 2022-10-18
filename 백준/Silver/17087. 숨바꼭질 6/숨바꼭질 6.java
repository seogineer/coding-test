import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int brothersCount = sc.nextInt();
    int subin = sc.nextInt();
    
    int[] brothersLocation = new int[brothersCount];
    for(int i = 0; i < brothersCount; i++){
      brothersLocation[i] = sc.nextInt();
    }

    int[] distance = new int[brothersCount];
    for(int i = 0; i < brothersCount; i++){
      if(brothersLocation[i] > subin){
        distance[i] = brothersLocation[i] - subin;
        continue;
      }
      
      if(brothersLocation[i] < subin){
        distance[i] = subin - brothersLocation[i];
      }
    }

    int answer = distance[0];
    for(int i = 1; i < distance.length; i++){
      answer = gcd(answer, distance[i]);
    }

    System.out.println(answer);
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