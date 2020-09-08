import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        
        if (a != b && b != c && a != c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
