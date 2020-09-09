import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i >= 0; i++) {
            int num = scanner.nextInt();
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (num == 0) {
                System.out.println(sum);
                break;
            } else {
                sum = sum + num;
            }
        }
    }
}