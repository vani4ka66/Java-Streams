import java.util.*;
import java.util.stream.Collectors;

public class Problem7RandomizeNumbersFromNtoM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer firstInteger = scanner.nextInt();
        Integer secondInteger = scanner.nextInt();
        Integer smallerNumber = Math.min(firstInteger, secondInteger);
        Integer biggerNumber = Math.max(firstInteger, secondInteger);

        List<Integer> randomizedNumbers = new ArrayList<>();
        randomizeNumbers(smallerNumber, biggerNumber,randomizedNumbers);
        for (Integer randomizedNumber : randomizedNumbers) {
            System.out.print(randomizedNumber + " ");
        }
    }

    private static void randomizeNumbers(Integer smallerNumber, Integer biggerNumber, List<Integer> randomizedNumbers) {
        Random randomGenerator = new Random();

        for (int i = 0; i <= biggerNumber - smallerNumber; i++) {
            Integer randomNumber = randomGenerator.nextInt(biggerNumber - smallerNumber + 1) + smallerNumber;
            while (randomizedNumbers.contains(randomNumber)) {
                randomNumber = randomGenerator.nextInt(biggerNumber - smallerNumber + 1) + smallerNumber;
            }
            randomizedNumbers.add(randomNumber);
        }

    }
}
