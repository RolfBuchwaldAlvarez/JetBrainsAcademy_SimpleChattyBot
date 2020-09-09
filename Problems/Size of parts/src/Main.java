import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 1; i <= n; i++) {
            int productState = scanner.nextInt();
            if (productState == 1) {
                larger += 1;
            } else if (productState == -1) {
                smaller += 1;
            } else {
                perfect += 1;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}