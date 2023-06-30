package Home_work1;
import java.util.Scanner;
public class FirstHW 
{
    public static void main(String[] args) 
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите конечное число(n): ");
        int n = iScanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n + 1; i++)
        {
            sum += i;
        }
        iScanner.close();
        System.out.println("Сумма чисел от 1 до n == " + sum);


        int fact = 1;
        for (int i = 1; i < n + 1; i++)
        {
            fact *= i;
        }
        System.out.println("n! == " + fact);
    }
}
