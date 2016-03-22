import java.util.Scanner;

public class Problem5ConvertFromDecimalToBase7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        System.out.println(Integer.toString(n,7));

    }
}
