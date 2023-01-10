import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Set<String> set = new HashSet<>(Arrays.asList("dream", "dreamer", "erase", "eraser"));
    int r = S.length();
    for (int l = S.length() - 1; l >= 0; l--) {
      String curr = S.substring(l, r);
      if (curr.length() > 7) {
        break;
      }
      if (set.contains(curr)) {
        r = l;
      }
    }
    System.out.println(r == 0 ? "YES" : "NO");
    sc.close();
  }
}
