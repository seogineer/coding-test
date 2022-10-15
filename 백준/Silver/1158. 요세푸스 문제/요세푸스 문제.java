import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Queue<String> queue = new LinkedList<>();
    for(int i = 1; i <= N; i++){
      queue.offer(String.valueOf(i));
    }

    List<String> list = new ArrayList<>();
    int K = sc.nextInt();
    for(int t = 0; t < N; t++){
      for(int i = 1; i <= K; i++){
        if(i == K){
          list.add(queue.poll());
          break;
        }
        queue.offer(queue.poll());
      }
    }

    System.out.println("<" + String.join(", ", list) + ">");
  }
}