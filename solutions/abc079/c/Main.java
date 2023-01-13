import java.util.Scanner;

public class Main {
  public static int getInt(String S, int i) {
    return S.charAt(i) - '0';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int a = getInt(S, 0), b = getInt(S, 1), c = getInt(S, 2), d = getInt(S, 3);
    if (a + b + c + d == 7) {
      System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
    } else if (a - b + c + d == 7) {
      System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
    } else if (a + b - c + d == 7) {
      System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
    } else if (a + b + c - d == 7) {
      System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
    } else if (a - b - c + d == 7) {
      System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
    } else if (a - b + c - d == 7) {
      System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
    } else if (a + b - c - d == 7) {
      System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
    } else if (a - b - c - d == 7) {
      System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
    }
    sc.close();
  }
}
