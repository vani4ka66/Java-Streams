import java.util.Scanner;

public class Problem2TriangleArea {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String first = console.nextLine();
        String[] firstArr = first.split(" ");
        int ax = Integer.parseInt(firstArr[0]);
        int ay = Integer.parseInt(firstArr[1]);

        String second = console.nextLine();
        String[] secondArr = second.split(" ");
        int bx = Integer.parseInt(secondArr[0]);
        int by = Integer.parseInt(secondArr[1]);

        String third = console.nextLine();
        String[] thirdArr = third.split(" ");
        int cx = Integer.parseInt(thirdArr[0]);
        int cy = Integer.parseInt(thirdArr[1]);

        int area = (ax*(by - cy) + bx*(cy - ay) + cx*(ay - by))/2;

        if (area >=0)
            System.out.println(area);
        else
            System.out.println(area*-1);

    }

}
