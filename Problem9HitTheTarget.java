import java.util.Scanner;

public class Problem9HitTheTarget {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <=20 ; i++) {
            for (int j = 1; j <=20 ; j++) {

                if (i + j == n){
                    System.out.printf("%d + %d = %d\n", i, j, n);
                }
                if (i - j == n){
                    System.out.printf("%d - %d = %d\n", i, j, n);
                }
            }
        }
    }
}
