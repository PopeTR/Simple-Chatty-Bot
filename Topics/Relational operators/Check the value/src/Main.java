import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer number = new Integer(scanner.nextInt());
        boolean result = number > 0 && number < 10;
        System.out.println(result);
    }
}
