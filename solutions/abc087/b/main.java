package solutions.abc087.b;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    final int C = sc.nextInt();
    final int X = sc.nextInt();
    int count = 0;
    int sum = 0;
    for (int i = 0; i <= A; i++) {
      for (int j = 0; j <= B; j++) {
        for (int k = 0; k <= C; k++) {
          sum = 500 * i + 100 * j + 50 * k;
          if (sum == X) {
            count++;
          }
        }
      }
    }

    System.out.println(count);
    sc.close();
  }
}
