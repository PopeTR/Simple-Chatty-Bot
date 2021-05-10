import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer one = new Integer(scanner.nextInt());
        Integer two = new Integer(scanner.nextInt());
        Integer three = new Integer(scanner.nextInt());
        
        boolean answer = (one <= two && two <= three) || (one >= two && two >= three);
        System.out.println(answer);
    }
}
