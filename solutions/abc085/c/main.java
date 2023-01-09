package c;
import java.util.*;

class Main {
  private static int[] helper(int N, int Y) {
    int currN = 0, currY = 0;
    for (int i = Y / 10000; i >= 0; i--) {
      for (int j = N - i; j >= 0; j--) {
        for (int k = N - i - j; k >= 0; k--) {
          currY = 10000 * i + 5000 * j + 1000 * k;
          currN = i + j + k;
          if (currY == Y) {
            if (currN == N) {
              return new int[] { i, j, k };
            }
          }
        }
      }
    }
    return new int[] { -1, -1, -1 };
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int[] res = helper(N, Y);
    System.out.println(res[0] + " " + res[1] + " " + res[2]);
    sc.close();
  }
}
