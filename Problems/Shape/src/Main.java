import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shape = scanner.nextInt();
        String firstAnswer = "You have chosen a ";
        String secondAnswer = "There is no such shape!";

        switch (shape) {
            case 1:
                System.out.println(firstAnswer + "square");
                break;
            case 2:
                System.out.println(firstAnswer + "circle");
                break;
            case 3:
                System.out.println(firstAnswer + "triangle");
                break;
            case 4:
                System.out.println(firstAnswer + "rhombus");
                break;
            default:
                System.out.println(secondAnswer);
                break;
        }
    }
}