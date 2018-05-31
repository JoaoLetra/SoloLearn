import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        System.out.print("Insert a number: ");
        int number = new Scanner(System.in).nextInt();


        spy(number);
        allSpyNumbers(number);


    }

    private static void allSpyNumbers(int number) {
        System.out.println("All spy numbers in this range:");

        for (int y = 10; y <= number; y++){
            String numLenght = Integer.toString(y);

            int sum = Character.getNumericValue(numLenght.charAt(0));
            int multiplication = Character.getNumericValue(numLenght.charAt(0));

            for (int i = 1; i < numLenght.length(); i++) {
                int x = Character.getNumericValue(numLenght.charAt(i));

                sum = sum + x;
                multiplication = multiplication * x;
            }

            if (sum == multiplication) {
                System.out.println(y);
            } else {
            }

        }
    }

    private static void spy(int number) {
        String numLenght = Integer.toString(number);

        int sum = Character.getNumericValue(numLenght.charAt(0));
        int multiplication = Character.getNumericValue(numLenght.charAt(0));

        for (int i = 1; i < numLenght.length(); i++) {
            int x = Character.getNumericValue(numLenght.charAt(i));

            sum = sum + x;
            multiplication = multiplication * x;
        }

        if (sum == multiplication) {
            System.out.println("Congratulations! " + number + " is a Spy Number!");
        } else {
            System.out.println("This is not a Spy Number!");
        }
    }
}
