import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string: ");
        String string = InputHandler.getStringInput(in);

        System.out.println("\nEnter substring: ");
        String substring = InputHandler.getStringInput(in);

        Solution solution = new Solution();
        MenuHandler menuHandler = new MenuHandler(in);

        while (menuHandler.shouldShowMenu()) {
            menuHandler.displayMenu();
            int selectedMenu = menuHandler.getSelectedMenu();

            switch (selectedMenu) {
                case 1:
                    solution.SetStrategy(new NaiveStrategy());
                    break;
                case 2:
                    solution.SetStrategy(new RabinKarpStrategy());
                    break;
                case 3:
                    System.out.println("New string: ");
                    string = InputHandler.getStringInput(in);
                    break;
                case 4:
                    System.out.println("New substring: ");
                    substring = InputHandler.getStringInput(in);
                    break;
                case 5:
                    menuHandler.setShowMenu(false);
                    break;
                default:
                    System.out.println("Something went wrong");
                    break;
            }

            if (menuHandler.shouldShowMenu()) {
                System.out.println("ANSWER: " + solution.GetSolution(string, substring));
            }
        }

        in.close();
    }
}