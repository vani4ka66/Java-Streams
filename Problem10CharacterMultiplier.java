import java.util.Scanner;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        String a;
        String b;

        if (line[0].length() > line[1].length()){
            a = line[0];
            b = line[1];
        }
        else {
            b = line[0];
            a = line[1];
        }

        long sum = calculateSum( a,  b);
        System.out.println(sum);
    }
    private  static  long calculateSum(String a, String b){
        long sum = 0;

        for (int i = 0; i < a.length(); i++) {
             if (i < b.length()){
                 sum += a.charAt(i)* b.charAt(i);
             }
            else {
                 sum += a.charAt(i);
             }

        }
        return  sum;
    }
}
