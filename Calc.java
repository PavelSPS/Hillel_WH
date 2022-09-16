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

        if (operation.equals("+"))
        {
            result = num1 + num2;
        }
        else if (operation.equals("-"))
        {
            result = num1 - num2;
        }
        else if (operation.equals("*"))
        {
            result = num1 * num2;
        }
        else if (operation.equals("/"))
        {
            result = num1 / num2;
        }
        else
        {
        result = 0;
        }
        {
            System.out.println("Result:");
            System.out.println(result);
        }

    }

}

