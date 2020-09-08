import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int newNum = Integer.parseInt(scanner.next());
        int oldNum;
        boolean ascending = true;
        boolean descending = true;

        while (true) {
            oldNum = newNum;
            newNum = Integer.parseInt(scanner.next());

            if (newNum == 0) {
                break;
            } else if (oldNum > newNum && ascending) {
                ascending = false;
                continue;
            } else if (oldNum < newNum && descending) {
                descending = false;
                continue;
            } else if (!ascending && !descending) {
                break;
            }
        }

        System.out.println(descending || ascending);
    }
}