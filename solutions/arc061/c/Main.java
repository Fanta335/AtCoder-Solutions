import java.util.Scanner;

public class Main {
  private static long res = 0;

  private static void helper(String S, int start, long sum) {
    if (start == S.length()) {
      res += sum;
      return;
    }
    for (int i = start; i < S.length(); i++) {
      helper(S, i + 1, sum + Long.valueOf(S.substring(start, i + 1)));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    helper(S, 0, 0);
    System.out.println(res);
    sc.close();
  }
}
