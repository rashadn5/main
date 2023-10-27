import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Linear Equation Calculator!");
        System.out.print("Enter the first coordinate point (x1, y1): ");
        String coor1 = scanner.nextLine();
        System.out.print("Enter the second coordinate point (x2, y2): ");
        String coor2 = scanner.nextLine();

        int addc1 = coor1.indexOf(", ");
        int addc2 = coor2.indexOf(", ");

        int x1 = Integer.parseInt(coor1.substring(1, addc1));
        int y1 = Integer.parseInt(coor1.substring(addc1 + 2, coor1.length() - 1));
        int x2 = Integer.parseInt(coor2.substring(1, addc2));
        int y2 = Integer.parseInt(coor2.substring(addc2 + 2, coor2.length() - 1));

        LinearEquation linearEquation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(linearEquation.lineInfo());

        System.out.print("Enter an x value to find the corresponding y: ");
        double xValue = scanner.nextDouble();
        String coordinate = linearEquation.findCoordinate(xValue);
        System.out.println("The corresponding point is " + coordinate);

        scanner.close();
    }
}