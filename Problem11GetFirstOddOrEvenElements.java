import java.util.Scanner;

public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");
        String[] command = scan.nextLine().split(" ");

        int number = Integer.parseInt(command[1]);
        String oddEven = (command[2]);

        StringBuilder sb = new StringBuilder();

        isOddOrEven(line, oddEven, sb);

        FirstNOddOrEvenElements(number, sb);
    }

    private static void isOddOrEven(String[] line, String oddEven, StringBuilder sb) {
        for (int i = 0; i < line.length; i++) {
            int num = Integer.parseInt(line[i]);

            if (oddEven.equals("odd")){
                if (num % 2 != 0){
                    sb.append(num);
                }
            }
            else {
                if (num % 2 == 0){
                    sb.append(num);
                }
            }
        }
    }

    private static void FirstNOddOrEvenElements(int number, StringBuilder sb) {
        for (int i = 0; i < sb.length() && number > 0;number--, i++) {
            System.out.print(sb.charAt(i) + " ");

        }
    }
}
