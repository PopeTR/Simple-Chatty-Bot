import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer one = Integer.valueOf(scanner.nextInt());
        Integer two = Integer.valueOf(scanner.nextInt());
        Integer three = Integer.valueOf(scanner.nextInt());
        Integer counter = 0;
        if (one > 0) {
            counter += 1;
        };
        if (two > 0) {
            counter += 1;
        };
        if (three > 0) {
            counter += 1;
        };
        boolean result = counter == 1;
        System.out.println(result);
    }
}
