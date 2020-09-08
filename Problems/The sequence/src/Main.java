import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j > i) {
                    continue;
                } else if (counter <= num) {
                    System.out.print(i + " ");
                    counter = counter + 1;
                }
            }
        }

    }
}