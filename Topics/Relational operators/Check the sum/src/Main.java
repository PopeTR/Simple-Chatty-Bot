import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer one = new Integer(scanner.nextInt());
        Integer two = new Integer(scanner.nextInt());
        Integer three = new Integer(scanner.nextInt());
        
        boolean result = (one + two) == 20 || (one + three) == 20 || (two + three) == 20;
        System.out.println(result);
        
    }
}
