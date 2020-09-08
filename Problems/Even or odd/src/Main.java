import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i >= 0; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                if (num % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        }
    }
}