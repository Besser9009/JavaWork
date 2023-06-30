package Home_work1;
import java.util.Scanner;
public class ThirdHW 
{
    public static void main(String[] args) 
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число для дальнейшего вычисления: ");
        double num1 = iScanner.nextDouble();
        System.out.printf("Введите второе число для дальнейшего вычисления: ");
        double num2 = iScanner.nextDouble();
        System.out.printf("Выберите выполняемое действие (+, -, /, *): ");
        String elem = iScanner.next();
        iScanner.close();
        double res = 0;
        switch (elem) {
            case "+":
                res = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + res);
                break;
            default:
                System.out.println("Такого действия нет...");
                break;
        }
    }
}
