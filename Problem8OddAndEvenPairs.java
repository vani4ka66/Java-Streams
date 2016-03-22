import java.util.Scanner;

public class Problem8OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");

        if (line.length %2 == 0) {
            for (int i = 0; i < line.length; i += 2) {
                int number1 = Integer.parseInt(line[i]);
                int number2 = Integer.parseInt(line[i + 1]);

                if (number1 % 2 == 0 && number2 % 2== 0){
                    System.out.printf("%d, %d -> both are even\n", number1, number2);
                }
                if (number1 % 2 != 0 && number2 % 2!= 0){
                    System.out.printf("%d, %d -> both are odd\n", number1, number2);
                }
                if (number1 % 2 == 0 && number2 % 2 != 0){
                    System.out.printf("%d, %d -> different\n", number1, number2);
                }
                if (number1 % 2 != 0 && number2 % 2 == 0){
                    System.out.printf("%d, %d -> different\n", number1, number2);
                }
            }
        }
        else {
            System.out.println("Invalid length");
        }
    }
}
