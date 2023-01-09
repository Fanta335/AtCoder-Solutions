package b;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer[] nums = new Integer[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }
    Arrays.sort(nums, (a, b) -> b - a);
    int count = 1;
    int prev = nums[0];

    for (int i = 1; i < N; i++) {
      if (nums[i] < prev) {
        count++;
        prev = nums[i];
      }
    }

    System.out.println(count);
    sc.close();
  }
}
