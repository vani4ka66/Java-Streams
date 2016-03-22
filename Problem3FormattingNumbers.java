import java.util.Scanner;
import java.util.Locale;


public class Problem3FormattingNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.useLocale(Locale.ENGLISH);

        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();

        String aHex = Integer.toHexString(a).toUpperCase();
        String aBin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        if (c%1 == 0) {
            System.out.printf("|%-10s|%s|%10.2f|%-10.0f|",aHex,aBin,b,c);
        }else {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",aHex,aBin,b,c);
        }

    }
}
