import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] nums = new int[N + 1][3];
    for (int i = 1; i <= N; i++) {
      nums[i][0] = sc.nextInt();
      nums[i][1] = sc.nextInt();
      nums[i][2] = sc.nextInt();
    }
    boolean can = true;
    int[] curr = new int[] {0, 0, 0};
    for (int i = 1; i <= N; i++) {
      int dist = Math.abs(nums[i][1] - curr[1]) + Math.abs(nums[i][2] - curr[2]);
      int time = nums[i][0] - curr[0];
      if (dist > time || (time - dist) % 2 != 0) {
        can = false;
        break;
      }
      curr[0] = nums[i][0];
      curr[1] = nums[i][1];
      curr[2] = nums[i][2];
    }
    System.out.println(can ? "Yes" : "No");
    sc.close();
  }
}
