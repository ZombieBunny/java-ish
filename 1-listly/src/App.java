import java.util.Scanner; // import the Scanner class 
import java.util.ArrayList; // import the Scanner class 

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        System.out.println("Welcome to your Todo Manager!\n");

        String choice = null;
        ArrayList<String> tasks = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        do {
            // Display the Menu
            System.out.println("Please choose an option\n");
            System.out.println("1. Add a task ");
            System.out.println("2. Remove a task ");
            System.out.println("4. List all tasks ");
            System.out.println("5. Exit");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Name your task ");
                    String _choice = input.nextLine();
                    tasks.add(_choice);
                    break;
                case "2":
                    System.out.println("Remove a task ");
                    choice = input.nextLine();
                    tasks.remove(choice);
                    break;
                case "4":
                    showList(tasks);
                    break;
                case "5":
                    choice = "-1";
                    break;
            }
        } while (Integer.parseInt(choice) >= 0);
    }

    public static void showList(ArrayList<String> list) throws Exception {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " +list.get(i));
        }
    }
}
