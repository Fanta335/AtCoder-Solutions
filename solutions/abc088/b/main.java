package b;
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    Integer[] nums = new Integer[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }
    Arrays.sort(nums, (a, b) -> b - a);
    int A = 0, B = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        A += nums[i];
      } else {
        B += nums[i];
      }
    }

    System.out.println(A - B);
    sc.close();
  }
}
