import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] pos = new int[N][2];
    for (int i = 0; i < N; i++) {
      pos[i][0] = sc.nextInt();
      pos[i][1] = sc.nextInt();
    }

    double res = 0;
    for (int i = 0; i < N - 1; i++) {
      for (int j = i + 1; j < N; j++) {
        double len =
            Math.sqrt(Math.pow(pos[i][0] - pos[j][0], 2) + Math.pow(pos[i][1] - pos[j][1], 2));
        res = Math.max(res, len);
      }
    }

    System.out.println(res);
    sc.close();
  }
}
