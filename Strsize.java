import java.util.Scanner;
public class Strsize
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        if (s1.equals(s2))
        {
            System.out.println("Both strings are equal.");
        }
        else
        {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}
