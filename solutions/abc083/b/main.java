package b;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    int sum = 0;
    int res = 0;
    for (int i = 1; i <= N; i++) {
      int curr = i;
      while (curr > 0) {
        sum += curr % 10;
        curr /= 10;
      }
      if (sum >= A && sum <= B) {
        res += i;
      }
      sum = 0;
    }

    System.out.println(res);
    sc.close();
  }
}
