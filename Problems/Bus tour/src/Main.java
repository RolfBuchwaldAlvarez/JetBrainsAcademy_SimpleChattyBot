import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int heightOfBus = scanner.nextInt();
        int numOfBridges = scanner.nextInt();

        for (int i = 1; i <= numOfBridges; i++) {
            int heightOfBridge = scanner.nextInt();
            if (heightOfBridge <= heightOfBus) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == numOfBridges) {
                System.out.println("Will not crash");
            }
        }
    }
}