import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

            Scanner scanner = new Scanner(System.in);
            int counter = 4;

            // put your code here
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if ((i % 4 == 0) && (i > counter)) {
                    counter = i;
                }
            }

            System.out.println(counter);


    }
}