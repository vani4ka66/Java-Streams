import java.util.Scanner;

public class Problem1RectangleArea {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        String[] arr = input.split(" ");

        int width = Integer.parseInt(arr[0]);
        int height = Integer.parseInt(arr[1]);

        System.out.println( width* height);

    }
}
