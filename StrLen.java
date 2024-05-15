import java.util.Scanner;
public class StrLen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        if (inputString.length() % 2 == 0)
        {
            System.out.println("string is even.");
        }
        else
        {
            System.out.println(" string is odd.");
        }
        scanner.close();
    }
}
