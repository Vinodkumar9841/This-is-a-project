public class daychrck {
  import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println("Uff, It's a weekday");
        } else if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Yayy, It's a weekend");
        } else {
            System.out.println("Invalid day");
        }

        scanner.close();
    }
}

  

