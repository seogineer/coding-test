import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int a = 0; a < N; a++){
      A[a] = sc.nextInt();
    }
    
    Map<Integer, Integer> count = new HashMap<>();
    for(int i = 0; i < A.length; i++){
      if(count.containsKey(A[i])){
        count.put(A[i], count.get(A[i]) + 1);
        continue;
      }
      count.put(A[i], 1);
    }

    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < A.length; i++){
      while(!stack.isEmpty() && count.get(A[stack.peek()]) < count.get(A[i])){
        A[stack.pop()] = A[i];
      }
      stack.push(i);
    }

    while(!stack.isEmpty()){
      A[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < A.length; i++){
      sb.append(A[i]).append(' ');
    }
    System.out.println(sb.toString());
    sc.close();
  }
}