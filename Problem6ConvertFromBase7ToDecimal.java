import java.util.Scanner;

public class Problem6ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String n = console.next();

        System.out.println(Integer.valueOf(n,7));


    }
}
