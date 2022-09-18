import java.util.Scanner;

public class Calc {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operation;

        System.out.println("Enter the number:");
        num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the number:");
        num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter an operation:");
        operation = scanner.nextLine();

        if (operation.equals("/") && num2 == 0)
        {
            System.out.println("You made a mistake, cannot be divided by 0. Try again:");
            return;
        }

        result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
        {
            System.out.println ("Result:"+"\n"+ result);
        }

    }

}

