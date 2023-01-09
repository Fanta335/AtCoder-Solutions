package b;
import java.util.Scanner;

class Main {
  private static int countDivision(int[] nums, int count) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 != 0) {
        return count;
      }
      nums[i] /= 2;
    }
    return countDivision(nums, count + 1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] nums = new int[N];
    for (int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }

    int count = countDivision(nums, 0);
    System.out.println(count);
    sc.close();
  }
}
