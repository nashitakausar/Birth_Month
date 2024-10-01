import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        System.out.print("Please enter your birth month (1-12): ");

        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an out of range month value: " + birthMonth);
            }
        } else

        {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Please re-enter an integer between 1 and 12.");
        }

        in.close();
    }
}
