import java.util.*;
public class Main {
    private static boolean[] used = new boolean[9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heights = new int[9];
        int totalSum = 0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
            totalSum += heights[i];
        }
        sc.close();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalSum - heights[i] - heights[j] == 100) {
                    heights[i] = 0;
                    heights[j] = 0;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        Arrays.sort(heights);
        for (int i = 2; i < 9; i++) {
            System.out.println(heights[i]);
        }
    }
}
